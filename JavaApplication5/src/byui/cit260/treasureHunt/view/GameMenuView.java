/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class GameMenuView {
    
    private final String MENU = "\n"
            + "\n---------------------------------------------------"
            + "\n| Game Menu                                       |"
            + "\n---------------------------------------------------"
            + "\nT-Treasure Map"
            + "\nI-Inventory"
            + "\nS-Status Report"
            + "\nG-Get Resources"
            + "\nM-Move to New Island"
            + "\nF-Fix Ship"
            + "\nV-View Island Map"
            + "\nE-Explore Current Island"
            + "\nH-Help"
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
        Scanner keyboard = new Scanner(System.in); 
        
        while (!valid){
            System.out.println("Enter your selection from Menu");
            value = keyboard.nextLine();
            value = value.trim();
            
            if(!"T".equals(value) && !"I".equals(value) && !"S".equals(value) && !"G".equals(value) && !"M".equals(value) && !"F".equals(value) && !"V".equals(value) && !"E".equals(value) && !"H".equals(value) && !"R".equals(value)) {
                System.out.println("Invalid input - choose from the main menu.");
                continue;
              
            }
           break;
        }
        return value;
    }

    private void doAction(char choice) {
        
        switch(choice) {
            case 'T': 
                System.out.println("dislay treasure map");
                break;
            case 'I':
                System.out.println("dislay inventory");
                break;
            case 'S':
                System.out.println("display Status Report");
                break;
            case 'G':
                System.out.println("call get resources function");
                break;
            case 'M':
                System.out.println("call move islands function");
                break;
            case 'F':
                System.out.println("call fix ship finction");
                break;
            case 'V':
                System.out.println("display island map");
            case 'E':
                System.out.println("call explore island function");
            case 'H':
                System.out.println("display help menu");
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Input Please Try Again ***");
                break;
        }
    }
}
