package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pressure_Station extends Model
{
    @Id
    private int id;

    private String imei;

    public  static Finder<Integer,Pressure_Station> find = new Finder<>(Pressure_Station.class);


    public Pressure_Station(int id, String imei) {
        this.id = id;
        this.imei = imei;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "PressureStation{" +
                "id=" + id +
                ", imei='" + imei + '\'' +
                '}';
    }
}
