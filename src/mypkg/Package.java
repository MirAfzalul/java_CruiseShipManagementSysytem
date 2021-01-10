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
 public class Package  implements Serializable {
    SimpleStringProperty item ,price;

    public Package(String item, String price) {
        this.item =new SimpleStringProperty (item);
        this.price = new SimpleStringProperty (price);
    }

    public String getItem() {
        return item.getValue();
    }

    public void setItem(SimpleStringProperty item) {
        this.item = item;
    }

    public String getPrice() {
        return price.getValue();
    }

    public void setPrice(SimpleStringProperty price) {
        this.price = price;
    }
    
}
