/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

/**
 *
 * @author Jake
 */
public class ResourcesControl {
    public double calcResourcesNeeded(double distance, double fish, double water, double coconuts) {
        if (distance < 1 || distance > 8.48528) {
            System.out.println("Error");
        }
        fish = 0.4;
        water = 0.2;
        coconuts = 0.2;
        double presources = fish + water + coconuts;
        double resourcesF = distance * fish;
        double resourcesW = distance * water;
        double resourcesC = distance * coconuts;
        String resources = ("You need " + resourcesF + " fish, " + resourcesW + " buckets of water, and "
        + resourcesC + " coconuts.");
        System.out.println(resources);
        return presources;
    }
}
