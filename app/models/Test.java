package models;

import io.ebean.Model;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Test extends Model
{

    private  String text;

    public Test(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static List<Test> getAll() {
        return new ArrayList<Test>();
    }

}
