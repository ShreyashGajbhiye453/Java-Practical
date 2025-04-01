/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeact11;

/**
 *
 * @author Shreyash
 */
public class TeamSport extends Sport{
     public int numberOfPlayers;
     public String captainName;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public TeamSport(int numberOfPlayers, String captainName, String sportsName, boolean indoor) {
        super(sportsName, indoor);
        this.numberOfPlayers = numberOfPlayers;
        this.captainName = captainName;
    }
     
     
     
   
    
    
}
