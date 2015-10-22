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
public class MapControl {
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
}
