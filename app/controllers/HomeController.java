package controllers;

import io.ebeaninternal.server.lib.util.Str;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;

import play.mvc.*;
import play.Logger;


import play.twirl.api.Content;
import views.html.Home.*;
import views.html.index;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static play.data.Form.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller
{

    Double P0 = null;
    Double P = null;


    public BishUsers getUserId(List<BishUsers> bishUsers, int id)
    {
        for (BishUsers b: bishUsers
             ) {
            if (b.getPs_id() == id)
            {
                return b;
            }

        }
        return null;
    }
    public int getId(List<Pressure_Station> pressure_stations, String imei)
    {
        for (Pressure_Station ps : pressure_stations
             ) {
            if (ps.getImei().equals(imei))
            {
                return ps.getId();
            }

        }
        return -1;
    }
    public Result gsm(String imei, String temperature, String basepressure) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        Date date = new Date();
        String date1 = formatter.format(date);
//            Date date2 = null;
//        try {
//            date2 = formatter.parse(date1);
//
//            System.out.println("Date " + date2);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

//        List<Test> tests = Test.find.all();

        List<Pressure_Station> pressure_stations = Pressure_Station.find.all();
        List<BishUsers> bishUsers = BishUsers.find.all();

        int id = getId(pressure_stations, imei);

        Logger.info(Integer.toString(id));


        BishUsers bishUsers1 = getUserId(bishUsers, id);

        if (bishUsers1 != null) {
            bishUsers1.setCurrent_altitude(Double.parseDouble(basepressure));
            bishUsers1.setCurrent_floor((int) (Double.parseDouble(basepressure) / 3) + 1);
            bishUsers1.save();
        } else
            Logger.info("Error");


        Logger.info("User id " + bishUsers1.getId());
        Logger.info("Obj_id " + bishUsers1.getOdj_id());
        Logger.info("Date ");
        Logger.info("Altitude" + Double.parseDouble(basepressure));
        Logger.info("Floor " + bishUsers1.getCurrent_floor());

        UserLoc userLoc = null;
        if (bishUsers1 != null) {
            userLoc = new UserLoc(bishUsers1.getId(), bishUsers1.getOdj_id(), date, Double.parseDouble(basepressure), bishUsers1.getCurrent_floor());
        } else {
            Logger.info("BishUsers null");
        }
//        userLoc = new UserLoc(1,1,new Date(),-0.07,1);
            userLoc.save();


//        Pressure_Station pressureStation = Pressure_Station.find.byId(imei);

//        if(pressureStation != null)
//        {
//            Logger.info(Integer.toString(id));
//        }else
//        {
//            Logger.info("error");
//        }


//        int floor = (int)(Double.parseDouble(basepressure) / 3) + 1;
//        int floor = 1;
            Logger.info("Imei " + imei + " " + "Temperature " + temperature + "\t" + "Base Pressure " + basepressure);


//                + " Floor " + floor);

//        if(imei.equals("860719027645880"))
//        {
//
//            P0 =  Double.parseDouble(pressure);
//        }
//        else
//            {
//                P = Double.parseDouble(pressure);
//            }
//         if (P != null && P0 != null)
//         {
//             Logger.info("Relative Attitude " + altitude(P,P0));
//             P = null;
//         }
//
//        Test test = new Test(imei,basepressure,temperature);
//        test.save();
            return ok(gsm.render(imei, basepressure, temperature));
        }


    public Result welcome(String name, String lastname)
    {
        return ok(welcome.render(name, lastname));
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index()
    {
        return ok(index.render("Hello from play."));
    }

}
