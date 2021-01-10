/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.Serializable;

/**
 *
 * @author Asif
 */
abstract public class Person implements Serializable{
    
    protected String id,name,password;
    abstract public void setData();
    abstract public void showData();

    public Person(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
        
    
    
}
