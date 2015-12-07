/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import byui.cit260.treasureHunt.model.Ship;
import exceptions.ResourcesControlException;

/**
 *
 * @author Jake
 */
public class ResourcesControl {
    public static Ship calcResourcesNeeded(Ship ship) throws ResourcesControlException {
        
        double fish = 0.4;
        double water = 0.2;
        double coconuts = 0.2;
        double distance = ship.getDistance();
        double presources = fish + water + coconuts;
        double resourcesF = distance * fish;
        double resourcesW = distance * water;
        double resourcesC = distance * coconuts;
        ship.setCoconuts(resourcesC);
        ship.setFish(resourcesF);
        ship.setWater(resourcesW);
        /**String resources = ("You need " + resourcesF + " fish, " + resourcesW + " buckets of water, and "
        + resourcesC + " coconuts.");
        System.out.println(resources);*/
        return ship;
    }
}
