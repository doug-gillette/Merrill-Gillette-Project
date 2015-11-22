/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Douglas
 */
public class TreasureMap implements Serializable{
    
    private String clue;
    private double locationFound;
    private double cluesRemaining;
    private Game[] game;
    private Clues[] clues;
    public TreasureMap() {
        this.clue = "You must look for an island shaped like a J.";
        this.locationFound = 0;
        this.cluesRemaining = 0;
    }

    
    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public double getLocationFound() {
        return locationFound;
    }

    public void setLocationFound(double locationFound) {
        this.locationFound = locationFound;
    }

    public double getCluesRemaining() {
        return cluesRemaining;
    }

    public void setCluesRemaining(double cluesRemaining) {
        this.cluesRemaining = cluesRemaining;
    }

    public Game[] getGame() {
        return game;
    }

    public Clues[] getClues() {
        return clues;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.clue);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.locationFound) ^ (Double.doubleToLongBits(this.locationFound) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.cluesRemaining) ^ (Double.doubleToLongBits(this.cluesRemaining) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TreasureMap other = (TreasureMap) obj;
        if (!Objects.equals(this.clue, other.clue)) {
            return false;
        }
        if (Double.doubleToLongBits(this.locationFound) != Double.doubleToLongBits(other.locationFound)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cluesRemaining) != Double.doubleToLongBits(other.cluesRemaining)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TreasureMap{" + "clue=" + clue + ", locationFound=" + locationFound + ", cluesRemaining=" + cluesRemaining + '}';
    }
    
    
}
