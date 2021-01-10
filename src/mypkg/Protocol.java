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
public class Protocol implements Serializable{
    private String noOfPpl,noOfLf,noOfBoat,destination;

    public Protocol(String noOfPpl, String noOfLf, String noOfBoat, String destination) {
        this.noOfPpl = noOfPpl;
        this.noOfLf = noOfLf;
        this.noOfBoat = noOfBoat;
        this.destination = destination;
    }
    
}
