
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.ProgramControl;
import byui.cit260.treasureHunt.model.Player;
import java.io.BufferedReader;
import treasureHunt.TreasureHunt;

public abstract class StartProgramView extends View{
    protected final BufferedReader keyboard = TreasureHunt.getInFile();
    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }
    public void startProgram() {
        this.displayBanner();
        String playersName = this.getPlayersName();
        Player player = ProgramControl.createPlayer(playersName);
        this.displayWelcomeMessage(player);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    private void displayBanner() {
        this.console.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*//////////////////////"
                + "\n*  This is Treasure Hunt Game."
                + "\n* In this game you will be searching for treasure");
         
         this.console.println("You are a grand adventurer that is searching the"
                 + "\n* high seas for the great treasure of the Pirate"
                 + "\n* Cpt. Jimmie Raven. You will sail around the Islands"
                 + "\n* in search of clues that will lead you to Jimmie's"
                 + "\n* treasure."); 
        
         this.console.println("May the Wind ever be behind you"
                 + "\n*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*//////////////////////");
    }
    private String getPlayersName() {
        boolean valid = false;
        String playersName = null; 
        
        while (!valid){
            this.console.println("Enter the player's name below:");
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();
            if (playersName.length() < 2){
                ErrorView.display(getClass().getName(),"Invalid name - the name must not be blank.");
                continue;
            }
            break;
        }
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n-----------------------------------"
                + "Welcome to the game," + player.getName());
    }
    
    
}
