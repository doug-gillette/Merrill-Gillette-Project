/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import byui.cit260.treasureHunt.model.Game;
import byui.cit260.treasureHunt.model.HidingPlaces;
import byui.cit260.treasureHunt.model.InventoryItem;
import byui.cit260.treasureHunt.model.IslandMap;
import byui.cit260.treasureHunt.model.Player;
import byui.cit260.treasureHunt.model.Ship;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Jake
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        Game game = new Game();
        TreasureHunt.setCurrentGame(game);
        game.setPlayer(player);
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        IslandMap map = MapControl.createMap();
        game.setIslandMap(map);
    }
    public enum Item {
    coconut,
    fish,
    water,
    wood,
    hammer,
    saw,
    spyglass;
    }
    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        InventoryItem coconut = new InventoryItem();
        coconut.setDescription("Coconut");
        coconut.setQuantityInStock(0);
        inventory[Item.coconut.ordinal()] = coconut;
        InventoryItem fish = new InventoryItem();
        fish.setDescription("Fish");
        fish.setQuantityInStock(0);
        inventory[Item.fish.ordinal()] = fish;
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        inventory[Item.water.ordinal()] = water;
        InventoryItem wood = new InventoryItem();
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        inventory[Item.wood.ordinal()] = wood;
        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        inventory[Item.hammer.ordinal()] = hammer;
        InventoryItem saw = new InventoryItem();
        saw.setDescription("Saw");
        saw.setQuantityInStock(0);
        inventory[Item.saw.ordinal()] = saw;
        InventoryItem spyglass = new InventoryItem();
        spyglass.setDescription("Spyglass");
        spyglass.setQuantityInStock(0);
        inventory[Item.spyglass.ordinal()] = spyglass;
        return inventory;
    }
    private static void assignHidingPlacesToLocations(IslandMap islandMap, HidingPlaces[] hidingPlaces) {
        Location[][] locations = islandMap.getLocations();
        Location[0][0].setHidingPlaces(hidingPlaces[HidingPlacesType.start.ordinal()]);
        Location[0][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[0][2].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[0][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[0][4].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[0][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[0][6].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[1][0].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[1][1].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[1][2].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[1][3].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[1][4].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[1][5].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[1][6].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[2][0].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[2][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[2][2].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[2][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[2][4].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[2][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[2][6].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[3][0].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[3][1].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[3][2].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[3][3].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[3][4].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[3][5].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[3][6].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[4][0].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[4][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[4][2].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[4][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[4][4].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[4][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[4][6].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[5][0].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[5][1].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[5][2].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[5][3].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[5][4].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[5][5].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[5][6].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[6][0].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[6][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[6][2].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[6][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[6][4].setHidingPlaces(hidingPlaces[HidingPlacesType.island.ordinal()]);
        Location[6][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        Location[6][6].setHidingPlaces(hidingPlaces[HidingPlacesType.end.ordinal()]);
    }
}
