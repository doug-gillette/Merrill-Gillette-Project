/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import byui.cit260.treasureHunt.model.HidingPlaces;
import byui.cit260.treasureHunt.model.IslandMap;
import byui.cit260.treasureHunt.model.Ship;
import exceptions.MapControlException;
import java.awt.Point;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Jake
 */
public class MapControl {
    public static IslandMap createMap() {
        IslandMap map = new IslandMap(7, 7);
        HidingPlaces[] hidingPlaces = byui.cit260.treasureHunt.model.HidingPlaces.createHidingPlaces();
        GameControl.assignHidingPlacesToLocations(map, hidingPlaces);
        return map;
    }

    static void moveShipToStartingLocation(IslandMap map) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public double calcDistanceTraveled(double xAxis, double yAxis, double xLocation, double yLocation) 
    throws MapControlException{
        if (xAxis < 1 || yAxis < 1) {
            throw new MapControlException("Cannot move to this location"
                    + "because the coordinates are outside the map");
        }
        if (xAxis > 7 || yAxis > 7) {
            throw new MapControlException("Cannot move to this location"
                    + "because the coordinates are outside the map");
        }
        double xDistance = Math.abs(xLocation - xAxis);
        double yDistance = Math.abs(yLocation - yAxis);
        if (xDistance == 0){
            return yDistance;
        }
        if (yDistance == 0){
            return xDistance;
        }
        double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        return distance;
    }
    public double calcDamages(double distance, double damages) throws MapControlException{
      
        if (distance < 0 || damages< 0) { 
          throw new MapControlException("Cannot move to this location"
                    + "because the coordinates are outside the map");  
            
        }
        
        if (distance > 8.5 || damages > 300) { 
            throw new MapControlException("Cannot move to this location"
                    + "because the coordinates are outside the map");
            
        }
        
        damages = ((distance +((1)+(int)(Math.random() * ((10-1)+1))))*10)+damages;
        return damages;
    }
    public void moveIsland(Ship ship, Point coordinates) throws MapControlException{
        IslandMap islandMap = TreasureHunt.getCurrentGame().getIslandMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= islandMap.getNoRows() || 
            newColumn < 0 || newColumn >= islandMap.getNoColumns()){
            throw new MapControlException("The Ship can not be moved to this"
                    + "location because the coordinates"
                    + "are outside the map boundaries");
        }
        
        
    }
}
