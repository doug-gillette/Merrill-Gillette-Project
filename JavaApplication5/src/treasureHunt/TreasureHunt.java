/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasureHunt;

import byui.cit260.treasureHunt.model.Game;
import byui.cit260.treasureHunt.model.Player;
import byui.cit260.treasureHunt.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jake
 */
public class TreasureHunt {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try {
        TreasureHunt.inFile = new BufferedReader(new InputStreamReader(System.in));
        TreasureHunt.outFile = new PrintWriter(System.out, true);
        String filePath = "log.txt";
        TreasureHunt.logFile = new PrintWriter(filePath);
        startProgramView.startProgram();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();          
        }
        finally {
            try {
                if(TreasureHunt.inFile != null)
                TreasureHunt.inFile.close();
                if(TreasureHunt.outFile != null)
                TreasureHunt.outFile.close();
                if(TreasureHunt.logFile != null)
                TreasureHunt.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TreasureHunt.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TreasureHunt.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TreasureHunt.logFile = logFile;
    }
    
}
