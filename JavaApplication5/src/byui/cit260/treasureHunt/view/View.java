/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Jake
 */
public abstract class View implements ViewInterface {
    private String promptMessage;
    protected final BufferedReader keyboard = TreasureHunt.getInFile();
    protected final PrintWriter console = TreasureHunt.getOutFile();
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {

        String value ="";
        boolean done = false;
        do {
            this.console.println(this.promptMessage);
            
            value = this.getInput();
            done = this.doAction(value);
            
        } while (!done);
    }
    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        while (!valid){
            value = this.keyboard.readLine();
            value = value.trim();
            
            if(value.length() < 1) {
                ErrorView.display(getClass().getName(),"You must enter a value.");
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
