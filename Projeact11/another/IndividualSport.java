/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeact11.another;

import com.example.Projeact11.Sport;

/**
 *
 * @author Shreyash
 */
public class IndividualSport extends Sport {
    public String playerName;
    public boolean physicalOrMind;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isPhysicalOrMind() {
        return physicalOrMind;
    }

    public void setPhysicalOrMind(boolean physicalOrMind) {
        this.physicalOrMind = physicalOrMind;
    }

    public IndividualSport(String playerName, boolean physicalOrMind, String sportsName, boolean indoor) {
        super(sportsName, indoor);
        this.playerName = playerName;
        this.physicalOrMind = physicalOrMind;
    }
    
    
    
    
    
    
    

    
}
