package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebeaninternal.server.lib.util.Str;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserLoc extends Model
{
    @Id
    private int id;
    private int user_id;
    private int object_id;
    private Date dt;
    private double altitude;
    private double floor;

    public  static Finder<Integer,UserLoc> find = new Finder<>(UserLoc.class);


//    public UserLoc(int user_id, int object_id, Date dt, double altitude) {
//        this.user_id = user_id;
//        this.object_id = object_id;
//        this.dt = dt;
//        this.altitude = altitude;
//    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getObject_id() {
        return object_id;
    }

    public void setObject_id(int object_id) {
        this.object_id = object_id;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    public UserLoc(int user_id, int object_id, Date dt, double altitude, double floor) {
        this.user_id = user_id;
        this.object_id = object_id;
        this.dt = dt;
        this.altitude = altitude;
        this.floor = floor;
    }
}
