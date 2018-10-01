package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BishObjects extends Model {
    @Id
    private Integer id;
    private String name;
    private String city;


    private String address;

    private Integer floors;
    private double fl_attitude;

    public Integer getFloors()
    {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public BishObjects(Integer id, String name, String city, String address, double fl_attitude) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.fl_attitude = fl_attitude;
    }


    public  static Finder<Integer, BishObjects> find = new Finder<>(BishObjects.class);


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BishObjects(String name, String city, String address, Integer floors, double fl_attitude)
    {
        this.name = name;
        this.city = city;
        this.address = address;
        this.floors = floors;
        this.fl_attitude = fl_attitude;
    }

    public double getFl_attitude() {
        return fl_attitude;
    }

    public void setFl_attitude(double fl_attitude) {
        this.fl_attitude = fl_attitude;
    }
}
