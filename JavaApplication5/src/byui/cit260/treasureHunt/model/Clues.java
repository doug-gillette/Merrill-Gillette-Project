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
public class Clues implements Serializable{
    
    private double clueNumber;
    private String clueDescription;

    public Clues() {
    }

    
    public double getClueNumber() {
        return clueNumber;
    }

    public void setClueNumber(double clueNumber) {
        this.clueNumber = clueNumber;
    }

    public String getClueDescription() {
        return clueDescription;
    }

    public void setClueDescription(String clueDescription) {
        this.clueDescription = clueDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.clueNumber) ^ (Double.doubleToLongBits(this.clueNumber) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.clueDescription);
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
        final Clues other = (Clues) obj;
        if (Double.doubleToLongBits(this.clueNumber) != Double.doubleToLongBits(other.clueNumber)) {
            return false;
        }
        if (!Objects.equals(this.clueDescription, other.clueDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clues{" + "clueNumber=" + clueNumber + ", clueDescription=" + clueDescription + '}';
    }
    
    
    
    
}
