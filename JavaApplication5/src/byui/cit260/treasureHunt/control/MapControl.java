/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import byui.cit260.treasureHunt.model.HidingPlaces;
import byui.cit260.treasureHunt.model.IslandMap;

/**
 *
 * @author Jake
 */
public class MapControl {
    public static IslandMap createMap() {
        IslandMap map = new IslandMap(7, 7);
        HidingPlaces[] hidingPlaces = createHidingPlaces();
        GameControl.assignHidingPlacesToLocations(map, hidingPlaces);
        return map;
    }

    private static HidingPlaces[] createHidingPlaces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double calcDistanceTraveled(double xAxis, double yAxis, double xLocation, double yLocation) {
        if (xAxis < 1 || yAxis < 1){
            return -1;
        }
        if (xAxis > 7 || yAxis > 7) {
            return -1;
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
    public double calcDamages(double distance, double damages) {
      
        if (distance < 0 || damages< 0) { 
            return -1;
            
        }
        
        if (distance > 8.5 || damages > 300) { 
            return -1;
            
        }
        
        damages = ((distance +((1)+(int)(Math.random() * ((10-1)+1))))*10)+damages;
        return damages;
    }
}
