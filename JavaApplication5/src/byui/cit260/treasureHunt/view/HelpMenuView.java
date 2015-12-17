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
public class HelpMenuView extends View{
    protected final BufferedReader keyboard = TreasureHunt.getInFile();
    public HelpMenuView() {
        super( "\n"
        + "\n---------------------------------------------------"
        + "\n| Help Menu                                       |"
        + "\n---------------------------------------------------"
        + "\nG-Goals"
        + "\nD-Description of the Game"
        + "\nH-How to play"
        + "\nR-Return to Main Menu"
        + "\n--------------------------------------------------");
    }
 
    public void displayMenu(boolean MENU) {
        char selection =' ';
        do {
            
            this.console.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
        } while (selection != 'Q');
    }
    @Override
    public String getInput() {
        boolean valid = false;
        String value = null; 
        
        while (!valid){
            this.console.println("Enter your selection from Menu");
            value = this.keyboard.readLine();
            value = value.trim();
            
            if(!"G".equals(value) && !"D".equals(value) && !"H".equals(value) && !"R".equals(value)) {
                this.console.println("Invalid input - choose from the main menu.");
                continue;
              
            }
           break;
        }
        return value;
    }

    private void doAction(char choice) {
        
        switch(choice) {
            case 'G': 
                this.console.println("display Goals");
                break;
            case 'D':
                this.console.println("display description");
                break;
            case 'H':
                this.console.println("display How to Play");
                break;
            case 'R':
                return;
            default:
                ErrorView.display(getClass().getName(),"\n*** Invalid Input Please Try Again ***");
                break;
        }
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
