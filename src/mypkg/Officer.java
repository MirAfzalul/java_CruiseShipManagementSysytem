/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Asif
 */
class Officer extends Person implements Serializable{
    private String rank;
    
    @Override
    public void setData() {
        Scanner s =new Scanner(System.in);
        super.id=s.nextLine();
        
    }

    public Officer(String rank, String id, String name, String password) {
        super(id, name, password);
        this.rank = rank;
    }

    @Override
    public void showData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
