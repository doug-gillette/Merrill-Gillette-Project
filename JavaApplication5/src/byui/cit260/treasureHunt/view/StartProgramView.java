/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

/**
 *
 * @author Douglas
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {
        
       // display banner 
        this.displayBanner();
        
       //
    }

    private void displayBanner() {
         System.out.println("\\\\\\\\\\\\\\\\\\\\\\*//////////////////////"
                 + "\n* This is Treasure Hunt Game."
                 + "\n* In this game you will be searching for treasure");
         
         System.out.println("YOu are a grand adventruer that is searching the"
                 + "\n* high seas for the great treasure of the Pirate "
                 + "\n* Cpt. Jimmie Raven. You will sail around the Islands"
                 + "\n* in search of clues that will lead you to Jimmie's "
                 + "\n* treasure.");
         
         System.out.println("May the Wind ever be behind you"
                 + "\n*\\\\\\\\\\\\\\\\\\\\\\*//////////////////////");
         
    }
    
}
