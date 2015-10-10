/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasureHunt;

import byui.cit260.treasureHunt.model.TreasureHuntGame;
import byui.cit260.treasureHunt.model.TreasureMap;
import byui.cit260.treasureHunt.model.Location;
import byui.cit260.treasureHunt.model.IslandLocation;
import byui.cit260.treasureHunt.model.HidingPlaces;
import byui.cit260.treasureHunt.model.Clues;
/**
 *
 * @author Jake
 */
public class TreasureHunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreasureHuntGame treasureFound = new TreasureHuntGame();
        
        treasureFound.setStartTime(0.00);
        treasureFound.setLastClue("You found the teasure!!");
        
        String gameInfo = treasureFound.toString();
        System.out.println(gameInfo);
        
        TreasureMap yourMap = new TreasureMap();
        
        yourMap.setClue("first clue");
        yourMap.setLocationFound(2);
        yourMap.setCluesRemaining(5);
        
        String mapInfo = yourMap.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        
        locationOne.setUnlocked("locked");
        locationOne.setRow(2);
        locationOne.setColumn(3);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        IslandLocation islandOne = new IslandLocation();
        
        islandOne.setDesrcription("Volcano");
        islandOne.setBlocked("blocked");
        islandOne.setTravelTime(5);
        islandOne.setResourcesNeeded(10);
        islandOne.setSearchDescription("The Volcano has a cave at its base");
        
        String islandInfo = islandOne.toString();
        System.out.println(islandInfo);
        
        HidingPlaces chestOne = new HidingPlaces();
        
        chestOne.setUnlocked("unlocked");
        chestOne.setDescription("Open Ches creaks when it opens");
        chestOne.setContent("clue 1");
        
        String hidingPlaceInfo = chestOne.toString();
        System.out.println(hidingPlaceInfo);
        
        Clues clueOne = new Clues();
        
        clueOne.setClueNumber(1);
        clueOne.setClueDescription("Next clue is in the volcano");
        
        String clueInfo = clueOne.toString();
        System.out.println(clueInfo);
        
        
    }
    
}
