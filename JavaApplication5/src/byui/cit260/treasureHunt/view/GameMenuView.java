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
                System.out.println("dislay inventory");
                break;
            case 'S':
                System.out.println("display Status Report");
                break;
            case 'G':
                System.out.println("call get resources function");
                break;
            case 'M':
                System.out.println("call move islands function");
                break;
            case 'F':
                System.out.println("call fix ship finction");
                break;
            case 'V':
                System.out.println("display island map");
            case 'E':
                System.out.println("call explore island function");
            case 'H':
                System.out.println("display help menu");
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
}
