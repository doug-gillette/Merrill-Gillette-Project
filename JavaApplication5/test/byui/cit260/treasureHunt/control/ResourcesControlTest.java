/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jake
 */
public class ResourcesControlTest {
    
    public ResourcesControlTest() {
    }

    /**
     * Test of calcResourcesNeeded method, of class ResourcesControl.
     */
    @Test
    public void testCalcResourcesNeeded() {
        System.out.println("calcResourcesNeeded");
        System.out.println("\tTest Case #1");
        double distance = 4;
        double fish = 0.4;
        double water = 0.2;
        double coconuts = 0.2;
        double expResult = 0.8;
        ResourcesControl instance = new ResourcesControl();
        double result = instance.calcResourcesNeeded(distance, fish, water, coconuts);
        assertEquals(expResult, result, 0.1);
        System.out.println("\tTest Case #2");
        distance = -1;
        fish = 0.4;
        water = 0.2;
        coconuts = 0.2;
        expResult = 0.8;
        result = instance.calcResourcesNeeded(distance, fish, water, coconuts);
        assertEquals(expResult, result, 0.1);
        System.out.println("\tTest Case #3");
        distance = 10;
        fish = 0.4;
        water = 0.2;
        coconuts = 0.2;
        expResult = 0.8;
        result = instance.calcResourcesNeeded(distance, fish, water, coconuts);
        assertEquals(expResult, result, 0.1);
        System.out.println("\tTest Case #4");
        distance = 1;
        fish = 0.4;
        water = 0.2;
        coconuts = 0.2;
        expResult = 0.8;
        result = instance.calcResourcesNeeded(distance, fish, water, coconuts);
        assertEquals(expResult, result, 0.1);
        System.out.println("\tTest Case #5");
        distance = 8.48528;
        fish = 0.4;
        water = 0.2;
        coconuts = 0.2;
        expResult = 0.8;
        result = instance.calcResourcesNeeded(distance, fish, water, coconuts);
        assertEquals(expResult, result, 0.1);
    }
    
}
