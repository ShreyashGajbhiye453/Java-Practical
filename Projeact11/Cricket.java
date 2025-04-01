/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeact11;

/**
 *
 * @author Shreyash
 */
public class Cricket extends TeamSport{
    public int overs;
    public String matchType;

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }


    
    
    public Cricket(int overs, String matchType, int numberOfPlayers, String captainName, String sportsName, boolean indoor) {
        super(numberOfPlayers, captainName, sportsName, indoor);
        setOvers(overs);
        this.matchType = matchType;
    }
    
    
}
