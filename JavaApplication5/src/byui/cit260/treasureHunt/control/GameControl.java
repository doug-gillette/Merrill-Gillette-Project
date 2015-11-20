/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import byui.cit260.treasureHunt.model.Player;

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
        game.setInventory(invetoryList);
        Ship ship = new Ship();
        game.setShip(ship);
        Map map = MapControl.createMap();
        game.setMap(map);
    }
    public static InventoryItem[] createInventoryList() {
            InventoryItem[] inventory = new InventoryItem[7];
            InventoryItem coconut = new InventoryItem();
            coconut.setDescription("Coconut");
            coconut.setQuantityInStock(0);
            inventory[0] = coconut;
            InventoryItem fish = new InventoryItem();
            fish.setDescription("Fish");
            fish.setQuantityInStock(0);
            inventory[1] = fish;
            InventoryItem water = Water");
            water.setQuantityInStock(0);
            inventory[2] = water;
            InventoryItem wood = new InventoryItem();
            wood.setDescription("Wood");
            wood.setQuantityInStock(0);
            inventory[3] = wood;
            InventoryItem hammer = new InventoryItem();
            hammer.setDescription("Hammer");
            hammer.setQuantityInStock(0);
            inventory[4] = hammer;
            InventoryItem saw = new InventoryItem();
            saw.setDescription("Saw");
            saw.setQuantityInStock(0);
            inventory[5] = saw;
            InventoryItem spyglass = new InventoryItem();
            spyglass.setDescription("Spyglass");
            spyglass.setQuantityInStock(0);
            inventory[6] = spyglass;
            return inventory;
        }
}
