/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasureHunt;

import byui.cit260.treasureHunt.model.Game;
import byui.cit260.treasureHunt.model.Player;
import byui.cit260.treasureHunt.view.StartProgramView;
/**
 *
 * @author Jake
 */
public class TreasureHunt {

    private static Game currentGame = null;
    private static Player player = null;
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.startProgram();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();          
        }
    }
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TreasureHunt.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TreasureHunt.player = player;
    }
    
}
