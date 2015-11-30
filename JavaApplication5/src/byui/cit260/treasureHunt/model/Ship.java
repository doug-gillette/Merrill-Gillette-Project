/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Jake
 */
public class Ship implements Serializable{
    private Point location;
    private double damageStatus;

    public Ship() {
        location = new Point (1,1);
        this.damageStatus = 0;
    }
    
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public double getDamageStatus() {
        return damageStatus;
    }

    public void setDamageStatus(double damageStatus) {
        this.damageStatus = damageStatus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.location);
        hash = 29 * hash + Objects.hashCode(this.damageStatus);
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
        if (!Objects.equals(this.location, other.location)) {
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
