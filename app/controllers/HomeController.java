package controllers;

import play.mvc.*;

import views.html.*;
import play.Logger;

import views.html.index;
import views.html.Home.welcome;
import views.html.Home.gsm;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result gsm(String imei, String temperature, String pressure)
    {
        Logger.info("Imei " + imei + " " + "Temperature " + temperature + "\t" + "Pressure " + pressure);
        return ok(gsm.render(imei,temperature,pressure));
    }

    public Result welcome(String name, String lastname) {
        return ok(welcome.render(name, lastname));
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Hello from play."));
    }

}
