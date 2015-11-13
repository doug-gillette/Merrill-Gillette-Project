/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;


/**
 *
 * @author Jake
 */
public class StatusReportView extends View{
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
            + "\n------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        char choice = value.charAt(0);
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
                return false;
            default:
                System.out.println("\n*** Invalid Input, Please Try Again ***");
                break;
        }
    return true;}
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
