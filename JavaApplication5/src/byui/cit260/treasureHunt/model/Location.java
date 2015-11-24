/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Douglas
 */
public class Location implements Serializable{
    
    private boolean unlocked;
    private double row;
    private double column;
    private IslandLocation islandLocation;
    private HidingPlaces hidingPlace;
    public Location() {
        this.unlocked = false;
        this.row = 1;
        this.column = 1;
    }
    
    public boolean getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public IslandLocation getIslandLocation() {
        return islandLocation;
    }

    public void setIslandLocation(IslandLocation islandLocation) {
        this.islandLocation = islandLocation;
    }

    public HidingPlaces getHidingPlace() {
        return hidingPlace;
    }

    public void setHidingPlaces(HidingPlaces hidingPlace) {
        this.hidingPlace = hidingPlace;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.unlocked);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.unlocked, other.unlocked)) {
            return false;
        }
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "unlocked=" + unlocked + ", row=" + row + ", column=" + column + '}';
    }
    
    
}
