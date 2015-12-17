/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.control;

import byui.cit260.treasureHunt.model.Game;
import byui.cit260.treasureHunt.model.HidingPlaces;
import byui.cit260.treasureHunt.model.HidingPlaces.HidingPlacesType;
import byui.cit260.treasureHunt.model.InventoryItem;
import byui.cit260.treasureHunt.model.IslandMap;
import byui.cit260.treasureHunt.model.Location;
import byui.cit260.treasureHunt.model.Player;
import byui.cit260.treasureHunt.model.Ship;
import exceptions.ResourcesControlException;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Jake
 */
public class GameControl {
    
    public static void createNewGame(Player player) throws ResourcesControlException {
        Game game = new Game();
        TreasureHunt.setCurrentGame(game);
        game.setPlayer(player);
        InventoryItem[] inventoryList = InventoryItem.createInventoryList();
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        IslandMap map = MapControl.createMap();
        game.setIslandMap(map);
        MapControl.moveShipToStartingLocation(map);
    }

    public static void saveGame(Game currentGame, String filePath) {
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);
        } 
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
        }
    }

    private static class locations {

        public locations() {
        }

        private void setHidingPlaces(HidingPlaces hidingPlace) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList = TreasureHunt.getCurrentGame().getInventory();
        InventoryItem[] inventoryList = originalInventoryList.clone();
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getInventoryType().
                        compareToIgnoreCase(inventoryList[j + 1].getInventoryType()) > 0) {
                tempInventoryItem = inventoryList[j];
                inventoryList[j] = inventoryList[j + 1];
                inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
    static void assignHidingPlacesToLocations(IslandMap islandMap, HidingPlaces[] hidingPlaces) {
        Location[][] locations = islandMap.getLocations();
        locations[0][0].setHidingPlaces(hidingPlaces[HidingPlacesType.start.ordinal()]);
        locations[0][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[0][2].setHidingPlaces(hidingPlaces[HidingPlacesType.Fiji.ordinal()]);
        locations[0][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[0][4].setHidingPlaces(hidingPlaces[HidingPlacesType.Volcano.ordinal()]);
        locations[0][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[0][6].setHidingPlaces(hidingPlaces[HidingPlacesType.Hawaii.ordinal()]);
        locations[1][0].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[1][1].setHidingPlaces(hidingPlaces[HidingPlacesType.Kawaii.ordinal()]);
        locations[1][2].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[1][3].setHidingPlaces(hidingPlaces[HidingPlacesType.Kuna.ordinal()]);
        locations[1][4].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[1][5].setHidingPlaces(hidingPlaces[HidingPlacesType.Mali.ordinal()]);
        locations[1][6].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[2][0].setHidingPlaces(hidingPlaces[HidingPlacesType.Colorado.ordinal()]);
        locations[2][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[2][2].setHidingPlaces(hidingPlaces[HidingPlacesType.Idaho.ordinal()]);
        locations[2][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[2][4].setHidingPlaces(hidingPlaces[HidingPlacesType.Samoa.ordinal()]);
        locations[2][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[2][6].setHidingPlaces(hidingPlaces[HidingPlacesType.Tonga.ordinal()]);
        locations[3][0].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[3][1].setHidingPlaces(hidingPlaces[HidingPlacesType.Tasmania.ordinal()]);
        locations[3][2].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[3][3].setHidingPlaces(hidingPlaces[HidingPlacesType.Maltese.ordinal()]);
        locations[3][4].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[3][5].setHidingPlaces(hidingPlaces[HidingPlacesType.McDonald.ordinal()]);
        locations[3][6].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[4][0].setHidingPlaces(hidingPlaces[HidingPlacesType.Arizona.ordinal()]);
        locations[4][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[4][2].setHidingPlaces(hidingPlaces[HidingPlacesType.Transylvania.ordinal()]);
        locations[4][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[4][4].setHidingPlaces(hidingPlaces[HidingPlacesType.Maui.ordinal()]);
        locations[4][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[4][6].setHidingPlaces(hidingPlaces[HidingPlacesType.York.ordinal()]);
        locations[5][0].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[5][1].setHidingPlaces(hidingPlaces[HidingPlacesType.Rhode.ordinal()]);
        locations[5][2].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[5][3].setHidingPlaces(hidingPlaces[HidingPlacesType.Rexburg.ordinal()]);
        locations[5][4].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[5][5].setHidingPlaces(hidingPlaces[HidingPlacesType.Meridian.ordinal()]);
        locations[5][6].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[6][0].setHidingPlaces(hidingPlaces[HidingPlacesType.Amazon.ordinal()]);
        locations[6][1].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[6][2].setHidingPlaces(hidingPlaces[HidingPlacesType.Brobdingnag.ordinal()]);
        locations[6][3].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[6][4].setHidingPlaces(hidingPlaces[HidingPlacesType.Lilliput.ordinal()]);
        locations[6][5].setHidingPlaces(hidingPlaces[HidingPlacesType.ocean.ordinal()]);
        locations[6][6].setHidingPlaces(hidingPlaces[HidingPlacesType.end.ordinal()]);
    }
}
