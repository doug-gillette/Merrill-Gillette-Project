/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import exceptions.MapControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jake
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcDistanceTraveled method, of class MapControl.
     */
    @Test
    public void testCalcDistanceTraveled() throws MapControlException {
        System.out.println("calcDistanceTraveled");
        System.out.println("\tTest case #1");
        double xAxis = 4;
        double yAxis = 4;
        double xLocation = 1;
        double yLocation = 1;
        double expResult = 4.24264;
        MapControl instance = new MapControl();
        double result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
        System.out.println("\tTest case #2");
        xAxis = 0;
        yAxis = 0;
        xLocation = 1;
        yLocation = 1;
        expResult = -1;
        result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
        System.out.println("\tTest case #3");
        xAxis = 9;
        yAxis = 3;
        xLocation = 1;
        yLocation = 1;
        expResult = -1;
        result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
        System.out.println("\tTest case #4");
        xAxis = 2;
        yAxis = 8;
        xLocation = 1;
        yLocation = 1;
        expResult = -1;
        result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
        System.out.println("\tTest case #5");
        xAxis = 7;
        yAxis = 1;
        xLocation = 1;
        yLocation = 1;
        expResult = 6;
        result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
        System.out.println("\tTest case #6");
        xAxis = 1;
        yAxis = 7;
        xLocation = 1;
        yLocation = 1;
        expResult = 6;
        result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
        System.out.println("\tTest case #7");
        xAxis = 7;
        yAxis = 7;
        xLocation = 1;
        yLocation = 1;
        expResult = 8.48528;
        result = instance.calcDistanceTraveled(xAxis, yAxis, xLocation, yLocation);
        assertEquals(expResult, result, 0.00001);
    }

    /**
     * Test of calcDamages method, of class MapControl.
     */
    @Test
    public void testCalcDamages() throws MapControlException {
        System.out.println("calcDamages");
        
        System.out.println("\tTest case #1");
        
        double distance = 4;
        double damages = 150;
        MapControl instance = new MapControl();
        double expResult = 245;
        double result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 45);
        
        System.out.println("\tTest case #2");
        
        distance = -1;
        damages = 150;
        
        expResult = -1;
        result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("\tTest case #3");
        
        distance = 4;
        damages = -1;
        
        expResult = -1;
        result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("\tTest case #4");
        
        distance = 4;
        damages = 324;
        
        expResult = -1;
        result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("\tTest case #5");
        
        distance = 1;
        damages = 0;
        
        expResult = 65;
        result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 45);
        
        System.out.println("\tTest case #6");
        
        distance = 4;
        damages = 300;
        
        expResult = 395;
        result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 45);
        
        System.out.println("\tTest case #7");
        
        distance = 8.5;
        damages = 100;
        
        expResult = 240;
        result = instance.calcDamages(distance, damages);
        assertEquals(expResult, result, 45);
    }
    
}
