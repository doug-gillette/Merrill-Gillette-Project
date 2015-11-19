/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import java.io.Serializable;
/**
 *
 * @author Jake
 */
public class IslandMap implements Serializable{
    private double noColumns;
    private double noRows;
    private Game[] game;
    public IslandMap() {
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
