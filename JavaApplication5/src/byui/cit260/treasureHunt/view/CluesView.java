/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.view;
        
public class CluesView extends View {
    public CluesView() {
        super ("This is a list of clues you've found so far."
        + "/n"
        + "list of clues"
        + "/nR-Return to the Game Menu");
    }
    @Override
    public boolean doAction(Object obj) {
    String value = (String) obj;
    char choice = value.charAt(0);
    if (choice == 'R') {
        return false;
    }
    else {
        ErrorView.display(getClass().getName(),"\n*** Invalid Input Please Try Again ***");
    }
    return true;
    }
}