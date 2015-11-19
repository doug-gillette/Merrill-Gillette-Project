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
public class IslandLocation implements Serializable{
    
    private String description;
    private String blocked;
    private double travelTime;
    private double resourcesNeeded;
    private String searchDescription;
    private Location[] location;
    private HidingPlaces[] hidingPlaces;
    public IslandLocation() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getResourcesNeeded() {
        return resourcesNeeded;
    }

    public void setResourcesNeeded(double resourcesNeeded) {
        this.resourcesNeeded = resourcesNeeded;
    }

    public String getSearchDescription() {
        return searchDescription;
    }

    public void setSearchDescription(String searchDescription) {
        this.searchDescription = searchDescription;
    }

    public Location[] getLocation() {
        return location;
    }

    public HidingPlaces[] getHidingPlaces() {
        return hidingPlaces;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.blocked);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.resourcesNeeded) ^ (Double.doubleToLongBits(this.resourcesNeeded) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.searchDescription);
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
        final IslandLocation other = (IslandLocation) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourcesNeeded) != Double.doubleToLongBits(other.resourcesNeeded)) {
            return false;
        }
        if (!Objects.equals(this.searchDescription, other.searchDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IslandLocation{" + "description=" + description + ", blocked=" + blocked + ", travelTime=" + travelTime + ", resourcesNeeded=" + resourcesNeeded + ", searchDescription=" + searchDescription + '}';
    }
    
    
}
