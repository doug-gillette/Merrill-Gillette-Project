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
            + "\nE-Explore Current Island"
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
                System.out.println("dislay treasure map");
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'S':
                this.displayStatusReport();
                break;
            case 'G':
                System.out.println("call get resources function");
                break;
            case 'M':
                System.out.println("call move to new island function");
                break;
            case 'F':
                System.out.println("call fix ship function");
                break;
            case 'V':
                this.displayIslandMap();
                break;
            case 'E':
                System.out.println("call explore island function");
                break;
            case 'H':
                System.out.println("display help menu");
                break;
            case 'R':
                return false;
            default:
                System.out.println("\n*** Invalid Input Please Try Again ***");
                break;
        }
        return true;
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        System.out.println("List of Inventory Items");
        System.out.println("Inventory Type" + "/t" +
                "In Stock");
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getInventoryType() + "/t  " +
                               inventoryItem.getQuantityInStock());
        }
    }

    private void displayIslandMap() {
        System.out.println("/n*** displayIslandMap stub function called ***");
    }

    private void displayStatusReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
