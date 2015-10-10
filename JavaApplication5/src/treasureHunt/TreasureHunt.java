/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasureHunt;

import byui.cit260.treasureHunt.model.TreasureHuntGame;
import byui.cit260.treasureHunt.model.TreasureMap;
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
    }
    
}
