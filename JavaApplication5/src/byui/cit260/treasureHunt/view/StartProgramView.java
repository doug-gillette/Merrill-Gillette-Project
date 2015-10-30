package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.ProgramControl;
import byui.cit260.treasureHunt.model.Player;
import java.util.Scanner;

public class StartProgramView {
    public StartProgramView() {
    }
    public void startProgram() {
        this.displayBanner();
        String playersName = this.getPlayersName();
        Player player = ProgramControl.createPlayer(playersName);
        this.displayWelcomeMessage(player);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }
    private void displayBanner() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*//////////////////////"
                + "\n*  This is Treasure Hunt Game."
                + "\n* In this game you will be searching for treasure");
         
         System.out.println("You are a grand adventruer that is searching the"
                 + "\n* high seas for the great treasure of the Pirate"
                 + "\n* Cpt. Jimmie Raven. You will sail around the Islands"
                 + "\n* in search of clues that will lead you to Jimmie's"
                 + "\n* treasure."); 
        
         System.out.println("May the Wind ever be behind you"
                 + "\n*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*//////////////////////");
    }
    private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); 
        
        while (!valid){
            System.out.println("Enter the player's name below:");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must not be blank.");
                continue;
            }
            break;
        }
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n-----------------------------------"
                + "Welcome to the game," + player.getName());
    }
}