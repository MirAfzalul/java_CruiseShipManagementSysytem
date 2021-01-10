/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.time.LocalDate;

/**
 *
 * @author Jessica
 */
public class Payment {
    
    protected String name, email, address;
   protected int cardnumber,pin;

    public Payment(String name, String email, String address, int cardnumber, int pin, LocalDate expireDate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.cardnumber = cardnumber;
        this.pin = pin;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
   protected LocalDate expireDate;
    
    
}
