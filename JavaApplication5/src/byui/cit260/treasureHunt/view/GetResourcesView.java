/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;

import byui.cit260.treasureHunt.control.GameControl;
import treasureHunt.TreasureHunt;
/**
 *
 * @author Douglas
 */
public class GetResourcesView extends View {
    public GetResourcesView() {
       super ("\n"
            + "\n------------------------------------"
            + "\n| Choose a Resource                    |"
            + "\n------------------------------------"
            + "\nF-Food"
            + "\nT-Tools"
            + "\nW-Wood"
            + "\nH-Help"
            + "\nR-Return to game menu"
            + "\n------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
       String value = (String) obj;
       char choice = value.charAt(0);
        switch(choice) {
            case 'F': 
                this.getFood();
                break;
            case 'T':
                this.getTools();
                break;
            case 'W':
                this.getWood();
                break;
            case 'H':
                this.resourcesHelp();
                break;
            case 'R':
                return false;
            default:
                System.out.println("\n*** Invalid Input Please Try Again ***");
                break;
        }
        return true;
    }
     private void resourcesHelp() {
        ResourcesHelpView resourcesHelp = new ResourcesHelpView();
        resourcesHelp.displayMenu();
    }
    private void getFood() {
        GetFoodView getFood = new GetFoodView();
        getFood.displayMenu();
    }
    private void getTools() {
        GetToolsView getTools = new GetToolsView();
        getTools.displayMenu();
    }
    private void getWood() {
        GetWoodView getWood = new GetWoodView();
        getWood.displayMenu();
    }
}
