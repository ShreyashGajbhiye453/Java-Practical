/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeact11.another;

/**
 *
 * @author Shreyash
 */
public class Chess extends IndividualSport{
    public float timeFactor;
    public int elo;

    public float getTimeFactor() {
        return timeFactor;
    }

    public void setTimeFactor(float timeFactor) {
        this.timeFactor = timeFactor;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }
    
    
    
    public Chess(float timeFactor, int elo, String playerName, boolean physicalOrMind, String sportsName, boolean indoor) {
        super(playerName, physicalOrMind, sportsName, indoor);
        this.timeFactor = (float)timeFactor;
        this.elo = elo;
    }
    
    
    
}
