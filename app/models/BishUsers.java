package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BishUsers extends Model
{
    @Id
    private int id;
    private String name;
    private String surname;
    private int ps_id;
    private int obj_id;

    public int getId() {
        return id;
    }

    public  static Finder<Integer,BishUsers> find = new Finder<>(BishUsers.class);

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPs_id() {
        return ps_id;
    }

    public void setPs_id(int ps_id) {
        this.ps_id = ps_id;
    }

    public int getOdj_id() {
        return obj_id;
    }

    public void setOdj_id(int odj_id) {
        this.obj_id = odj_id;
    }

    public double getCurrent_altitude() {
        return current_altitude;
    }

    public void setCurrent_altitude(double current_altitude) {
        this.current_altitude = current_altitude;
    }

    public int getCurrent_floor() {
        return current_floor;
    }

    public void setCurrent_floor(int current_floor) {
        this.current_floor = current_floor;
    }

    public BishUsers(int id, String name, String surname, int ps_id, int odj_id, double current_altitude, int current_floor) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.ps_id = ps_id;
        this.obj_id = odj_id;
        this.current_altitude = current_altitude;
        this.current_floor = current_floor;
    }

    private double current_altitude;
    private int current_floor;
}
