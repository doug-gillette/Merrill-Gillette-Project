/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.GameControl;
import java.util.Scanner;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Jake
 */
public class MainMenuView {

    
    private final String MENU = "\n"
            + "\n---------------------------------------------------"
            + "\n| Main Menu                                       |"
            + "\n---------------------------------------------------"
            + "\nB-Begin Game"
            + "\nO-Open Saved Game"
            + "\nH-Help"
            + "\nS-Save Level"
            + "\nR-Reset"
            + "\nQ-Quit"
            + "\n--------------------------------------------------";
    
    void displayMenu() {

        char selection =' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
        } while (selection != 'Q');
    }
    
    private String getInput() {
        boolean valid = false;
        String value = null;
        Scanner keyboard = new Scanner(System.in); 
        
        while (!valid){
            System.out.println("Enter your selection from Menu");
            value = keyboard.nextLine();
            value = value.trim();
            
            if(!"B".equals(value) && !"O".equals(value) && !"H".equals(value) && !"S".equals(value) && !"R".equals(value) && !"Q".equals(value)) {
                System.out.println("Invalid input - choose from the main menu.");
                continue;
              
            }
           break;
            
        }
        return value;
    }
    public void doAction(char choice) {
       
        switch(choice) {
            case 'B': 
                this.beginNewGame();
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
                return;
            default:
                System.out.println("\n*** Invalid Input Please Try Again ***");
                break;
        }
    }
    private void beginNewGame() {
        GameControl.createNewGame(TreasureHunt.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
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
