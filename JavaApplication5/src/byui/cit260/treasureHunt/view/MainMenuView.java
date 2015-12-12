/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.GameControl;
import exceptions.ResourcesControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Jake
 */
public class MainMenuView extends View {
    public MainMenuView() {
        super("\n"
            + "\n---------------------------------------------------"
            + "\n| Main Menu                                       |"
            + "\n---------------------------------------------------"
            + "\nB-Begin Game"
            + "\nO-Open Saved Game"
            + "\nH-Help"
            + "\nS-Save Level"
            + "\nR-Reset"
            + "\nQ-Quit"
            + "\n--------------------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
       String value = (String) obj;
       char choice = value.charAt(0);
        switch(choice) {
            case 'B': 
       {
           try {
               this.beginNewGame();
           } catch (ResourcesControlException ex) {
               Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
                break;
            case 'O':
                this.openSavedGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'R':
                this.resetGame();
                break;
            case 'Q':
                return false;
            default:
                System.out.println("\n*** Invalid Input Please Try Again ***");
                break;
        }
        return true;
    }
    private void beginNewGame() throws ResourcesControlException {
        GameControl.createNewGame(TreasureHunt.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void openSavedGame() {
        System.out.println("*** openSavedGame() function called ***");
    }
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
    private void resetGame() {
        System.out.println("*** resetGame() function called ***");
    }
    
}
