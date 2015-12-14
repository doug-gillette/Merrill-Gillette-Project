/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Douglas
 */
public class Location implements Serializable{
    
    private boolean unlocked;
    private Point coordinates;
    private IslandLocation islandLocation;
    private HidingPlaces hidingPlaces;
    public Location() {
        this.unlocked = false;
        coordinates = new Point (1,1);
    }
    
    public boolean getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
    public IslandLocation getIslandLocation() {
        return islandLocation;
    }

    public void setIslandLocation(IslandLocation islandLocation) {
        this.islandLocation = islandLocation;
    }

    public HidingPlaces getHidingPlace() {
        return hidingPlaces;
    }

    public void setHidingPlaces(HidingPlaces hidingPlaces) {
        this.hidingPlaces = hidingPlaces;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.unlocked ? 1 : 0);
        hash = 13 * hash + Objects.hashCode(this.coordinates);
        hash = 13 * hash + Objects.hashCode(this.islandLocation);
        hash = 13 * hash + Objects.hashCode(this.hidingPlaces);
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
        if (this.unlocked != other.unlocked) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.islandLocation, other.islandLocation)) {
            return false;
        }
        if (!Objects.equals(this.hidingPlaces, other.hidingPlaces)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "unlocked=" + unlocked + ", coordinates=" + coordinates + ", islandLocation=" + islandLocation + ", hidingPlaces=" + hidingPlaces + '}';
    }

  

    
    
    
}
