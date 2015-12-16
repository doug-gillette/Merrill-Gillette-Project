/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import byui.cit260.treasureHunt.view.ErrorView;
import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Jake
 */
public class IslandMap implements Serializable{
    private double noColumns;
    private double noRows;
    private Game[] game;
    private Location[][] locations;
    private Point coordinates;
    public IslandMap() {
        this.noColumns = 7;
        this.noRows = 7;
    }

    public IslandMap(int noRows, int noColumns) {
        if (noRows < 1 || noColumns < 1) {
            ErrorView.display(this.getClass().getName(),"The number of rows and colums must be > zero");
            return;
        }
        this.noRows = noRows;
        this.noColumns = noColumns;
        this.locations = new Location[noRows][noColumns];
        for (int row = 0; row < noRows; row++) {
            for(int column = 0; column < noColumns; column++) {
                Location location = new Location();
                location.setCoordinates(coordinates);
                location.setUnlocked(false);
                locations[row][column] = location;
            }
        }
    }
    
    public double getNoColumns() {
        return noColumns;
    }

    public void setNoColumns(double noColumns) {
        this.noColumns = noColumns;
    }

    public double getNoRows() {
        return noRows;
    }

    public void setNoRows(double noRows) {
        this.noRows = noRows;
    }

    public Game[] getGame() {
        return game;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.noColumns) ^ (Double.doubleToLongBits(this.noColumns) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.noRows) ^ (Double.doubleToLongBits(this.noRows) >>> 32));
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
        final IslandMap other = (IslandMap) obj;
        if (Double.doubleToLongBits(this.noColumns) != Double.doubleToLongBits(other.noColumns)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noRows) != Double.doubleToLongBits(other.noRows)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IslandMap{" + "noColumns=" + noColumns + ", noRows=" + noRows + '}';
    }
    
}
