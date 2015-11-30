/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.MapControl;
import byui.cit260.treasureHunt.model.Ship;
import exceptions.MapControlException;
import java.awt.Point;


/**
 *
 * @author Douglas
 */
public class MoveIslandView extends View {
    
    public MoveIslandView() {
        super ("Enter the coordinates of the Island"
                + "that you would like to travel to"
                + "in the form of x,y");
    }

    @Override
    public boolean doAction(Object obj) {
       
       String value = (String) obj;
       double xCoordinate = value.charAt(0);
       double yCoordinate = value.charAt(2);
       Ship ship = new Ship();
       Point currentCoordinates = ship.getLocation();
       double currentx = currentCoordinates.x;
       double currenty = currentCoordinates.y;
       double currentDamage = ship.getDamageStatus();
       
       
       MapControl mapControl = new MapControl();
       
        try {
            double distance = mapControl.calcDistanceTraveled(xCoordinate, yCoordinate, currentx, currenty);
            
            double damage = mapControl.calcDamages(distance, currentDamage);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
       
       
       
        return false;
    }
}
