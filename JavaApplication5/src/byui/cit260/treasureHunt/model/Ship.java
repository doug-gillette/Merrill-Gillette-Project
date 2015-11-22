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
public class Ship implements Serializable{
    private double location;
    private String damageStatus;

    public Ship() {
        this.location = 0;
        this.damageStatus = "The ship is in shipshape condition, sir!";
    }
    
    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public String getDamageStatus() {
        return damageStatus;
    }

    public void setDamageStatus(String damageStatus) {
        this.damageStatus = damageStatus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.location) ^ (Double.doubleToLongBits(this.location) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.damageStatus);
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
        final Ship other = (Ship) obj;
        if (Double.doubleToLongBits(this.location) != Double.doubleToLongBits(other.location)) {
            return false;
        }
        if (!Objects.equals(this.damageStatus, other.damageStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "location=" + location + ", damageStatus=" + damageStatus + '}';
    }
    
}
