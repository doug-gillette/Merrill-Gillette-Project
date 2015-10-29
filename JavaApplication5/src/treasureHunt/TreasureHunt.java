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
import byui.cit260.treasureHunt.view.StartProgramView;
/**
 *
 * @author Jake
 */
public class TreasureHunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }
    
}
