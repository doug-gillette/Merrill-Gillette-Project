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
public class StatusReportView {
    public StatusReportView() {
        super ("\n"
            + "\n------------------------------------"
            + "\n| Status Report                    |"
            + "\n------------------------------------"
            + "\nI-Inventory"
            + "\nD-Damages to ship"
            + "\nP-Progress"
            + "\nC-Current island"
            + "\nH-Help"
            + "\nR-Return to game menu"
            + "\n------------------------------------";)
    void displayReport() {
        char selection = ' ';
        do {
            System.out.println(REPORT);
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
        } while (selection != 'R');
    }
    private String getInput() {
        boolean valid = false;
        String value = null;
        Scanner keyboard = new Scanner(System.in); 
        while (!valid){
            System.out.println("Enter your selection from Status Report");
            value = keyboard.nextLine();
            value = value.trim();
            if(!"I".equals(value) && !"D".equals(value) && !"P".equals(value) && !"C".equals(value) && !"H".equals(value) && !"R".equals(value)) {
                System.out.println("Invalid input - choose from the main menu.");
                continue;
            }
           break;
        }
        return value;
    }
    private void doAction(char choice) {
        switch(choice) {
            case 'I':
                this.displayInventory();
                break;
            case 'D':
                this.displayDamages();
                break;
            case 'P':
                this.displayProgress();
                break;
            case 'C':
                this.displayCurrentIsland();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Input, Please Try Again ***");
                break;
        }
    }
    private void displayInventory() {
        System.out.println("*** displayInventory() function called ***");
    }
    private void displayDamages() {
        System.out.println("*** displayDamages() function  called ***");
    }
    private void displayProgress() {
        System.out.println("*** displayProgress() function called ***");
    }
    private void displayCurrentIsland() {
        System.out.println("*** displayCurrentIsland() function called ***");
    }
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}
