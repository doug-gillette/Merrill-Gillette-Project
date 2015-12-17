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
public class SaveGameView extends View{
    public SaveGameView() {
        super ("Are you sure you want to save?"
                        + "Y / N");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        char choice = value.charAt(0);
        if (choice == 'Y') {
            this.yesSaveGame();
        }
        else if (choice == 'N') {
            return false;
        }
        else{
            this.console.println("\n*** Invalid Input Please Try Again ***");
        }   
    return true;}
    private void yesSaveGame() {
        this.console.println("*** yesSaveGame() function called ***");
    }
}