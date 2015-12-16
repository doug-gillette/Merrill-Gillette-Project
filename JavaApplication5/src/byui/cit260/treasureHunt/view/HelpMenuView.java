/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import java.io.BufferedReader;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Douglas
 */
public class HelpMenuView {
    protected final BufferedReader keyboard = TreasureHunt.getInFile();
    
    private final String MENU = "\n"
        + "\n---------------------------------------------------"
        + "\n| Help Menu                                       |"
        + "\n---------------------------------------------------"
        + "\nG-Goals"
        + "\nD-Description of the Game"
        + "\nH-How to play"
        + "\nR-Return to Main Menu"
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
        
        while (!valid){
            System.out.println("Enter your selection from Menu");
            value = this.keyboard.readLine();
            value = value.trim();
            
            if(!"G".equals(value) && !"D".equals(value) && !"H".equals(value) && !"R".equals(value)) {
                System.out.println("Invalid input - choose from the main menu.");
                continue;
              
            }
           break;
        }
        return value;
    }

    private void doAction(char choice) {
        
        switch(choice) {
            case 'G': 
                System.out.println("display Goals");
                break;
            case 'D':
                System.out.println("display description");
                break;
            case 'H':
                System.out.println("display How to Play");
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Input Please Try Again ***");
                break;
        }
    }
    
}
