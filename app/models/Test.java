package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Test extends Model
{

    public  static  Finder<Integer,Test> find = new Finder<>(Test.class);

    @Id
    private Integer id;
    private  String imei;
    private String pressure;
    private String temperature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Test(String imei, String pressure, String temperature) {
        this.imei = imei;
        this.pressure = pressure;
        this.temperature = temperature;
    }
    //    public static List<Test> getAll() {
//        return new ArrayList<Test>();
//    }

}
