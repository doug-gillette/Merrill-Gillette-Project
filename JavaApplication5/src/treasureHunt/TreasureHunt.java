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
import byui.cit260.treasureHunt.model.InventoryItem;
import byui.cit260.treasureHunt.model.IslandMap;
import byui.cit260.treasureHunt.model.Player;
import byui.cit260.treasureHunt.model.Ship;
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
        islandOne.setDescription("Volcano");
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
        
        InventoryItem item = new InventoryItem();
        item.setInventoryType("water");
        item.setQuantityInStock(8);
        String itemInfo = item.toString();
        System.out.println(itemInfo);
        
        IslandMap island = new IslandMap();
        island.setNoColumns(7);
        island.setNoRows(7);
        String islandMapInfo = island.toString();
        System.out.println(islandMapInfo);
        
        Player playerOne = new Player();
        playerOne.setBestTime(8.00);
        playerOne.setName("George Jetson");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Ship myShip = new Ship();
        myShip.setDamageStatus("The ship is in shape, sir.");
        myShip.setLocation(0.0);
        String shipInfo = myShip.toString();
        System.out.println(shipInfo);
    }
    
}
