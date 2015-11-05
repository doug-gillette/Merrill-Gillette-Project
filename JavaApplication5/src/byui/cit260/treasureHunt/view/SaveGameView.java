/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class SaveGameView {
    private final String SAVE = ("Are you sure you want to save?"
                        + "Y / N");
    private void saveGame() {
    char selection =' ';
        do {
            System.out.println(SAVE);
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
            System.out.println("Enter Y for yes or N for no.");
            value = keyboard.nextLine();
            value = value.trim();
            if(!"Y".equals(value) && !"N".equals(value)) {
                System.out.println("Invalid input - choose again.");
                continue;
            }
           break;
        }
        return value;
    }
    public void doAction(char choice) {
       
        if (choice == 'Y') {
            this.yesSaveGame();
        }
        else if (choice == 'N') {
            return;
        }
        else{
            System.out.println("\n*** Invalid Input Please Try Again ***");
        }   
    }
    private void yesSaveGame() {
        System.out.println("*** yesSaveGame() function called ***");
    }
}
