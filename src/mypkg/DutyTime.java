/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jessica
 */
public class DutyTime implements Serializable{
    private SimpleStringProperty id ,name,time;

    public DutyTime(String id, String name, String time) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.time = new SimpleStringProperty(time);
    }

    public String getId() {
        return id.get();
    }

    public void setId(SimpleStringProperty id) {
        this.id = id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }

    public String getTime() {
        return time.get();
    }

    public void setTime(SimpleStringProperty time) {
        this.time = time;
    }
    
    
}
