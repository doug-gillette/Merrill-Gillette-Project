/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.MapControl;
import byui.cit260.treasureHunt.control.ResourcesControl;
import byui.cit260.treasureHunt.model.InventoryItem;
import exceptions.ResourcesControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Douglas
 */
class GetFoodView extends View{

    public GetFoodView() {
        super("So here's how much coconuts, fish, and buckets of water you'll need "
                + "for your trip to the next island.");
    }
    public void displayMenu() {
        System.out.println("Display the get Food Menu");
    }

    @Override
    public boolean doAction(Object obj) {
        try {
            //calculate amount of coconuts, fish, and water
            //display amount of fish needed
            //display amount of coconuts needed
            //display amount of water needed

            ResourcesControl.calcResourcesNeeded(TreasureHunt.getCurrentGame().getShip());
            System.out.println(TreasureHunt.getCurrentGame().getShip());
        } catch (ResourcesControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        
        }
        return true;
    }

    private MapControl MapControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
