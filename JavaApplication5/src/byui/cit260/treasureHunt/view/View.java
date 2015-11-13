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
public abstract class View implements ViewInterface {
    private String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {

        String value ="";
        boolean done = false;
        do {
            System.out.println(this.promptMessage);
            
            value = this.getInput();
            done = this.doAction(value);
            
        } while (!done);
    }
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        while (!valid){
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("You must enter a value.");
                continue;
              
            }
           break;
            
        }
        return value;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
}
