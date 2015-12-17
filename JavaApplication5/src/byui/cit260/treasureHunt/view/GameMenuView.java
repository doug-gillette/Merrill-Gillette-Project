/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.GameControl;
import byui.cit260.treasureHunt.model.InventoryItem;



/**
 *
 * @author Douglas
 */
public class GameMenuView extends View {
    public GameMenuView() {
    
           super("\n"
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
            + "\nH-Help"
            + "\nR-Return to Main Menu"
            + "\n--------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
       char choice = value.charAt(0);
        switch(choice) {
            case 'T': 
                this.displayTreasureMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'S':
                this.displayStatusReport();
                break;
            case 'G':
                this.getResources();
                break;
            case 'M':
                this.displayMoveIsland();
                break;
            case 'F':
                this.fixShip();
                break;
            case 'V':
                this.displayIslandMap();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'R':
                return false;
            default:
                ErrorView.display(getClass().getName(),"\n*** Invalid Input Please Try Again ***");
                break;
        }
        return true;
    }
    private void displayTreasureMap() {
        this.console.println("/n*** displayTreasureMap function called ***");
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        this.console.println("List of Inventory Items");
        this.console.println("Inventory Type" + "/t" +
                "In Stock");
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getInventoryType() + "/t  " +
                               inventoryItem.getQuantityInStock());
        }
    }

    private void displayIslandMap() {
        this.console.println("/n*** displayIslandMap stub function called ***");
    }

    private void displayStatusReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMoveIsland() {
        MoveIslandView moveIsland = new MoveIslandView();
        moveIsland.display();
        
    }

    private void getResources() {
        GetResourcesView getResources = new GetResourcesView();
        getResources.display();
    }

    private void fixShip() {
        
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}
