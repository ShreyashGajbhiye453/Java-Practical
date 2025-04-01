/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeact11;

/**
 *
 * @author Shreyash
 */
public class Sport {
    public String sportsName;
    public boolean indoor;

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public Sport(String sportsName, boolean indoor) {
        setSportsName(sportsName);
        this.indoor = indoor;
    }
    
    
    
    
    
    
}
