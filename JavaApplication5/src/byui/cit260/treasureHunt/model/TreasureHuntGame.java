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
 * @author Jake
 */
public class TreasureHuntGame implements Serializable{
    
    private double startTime;
    private String lastClue;

    public TreasureHuntGame() {
    }
    
    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public String getLastClue() {
        return lastClue;
    }

    public void setLastClue(String lastClue) {
        this.lastClue = lastClue;
    }

    @Override
    public String toString() {
        return "TreasureHuntGame{" + "startTime=" + startTime + ", lastClue=" + lastClue + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.lastClue);
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
        final TreasureHuntGame other = (TreasureHuntGame) obj;
        if (Double.doubleToLongBits(this.startTime) != Double.doubleToLongBits(other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.lastClue, other.lastClue)) {
            return false;
        }
        return true;
    }

    
}
