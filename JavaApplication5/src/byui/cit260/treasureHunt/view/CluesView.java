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
        + clueA + "/n" + clueB + "/n" + clueC + "/n" + clueD + "/n" + clueE + "/n" + clueF + "/n" 
        + clueG + "/n" + clueH + "/n" + clueI + "/n" + clueJ + "/n" + clueK + "/n" + clueL + "/n" 
        + clueM + "/n" + clueN + "/n" + clueO + "/n" + clueP + "/n" + clueQ + "/n" + clueR + "/n" 
        + clueS + "/n" + clueT + "/n" + clueU + "/n" + clueV + "/n" + clueW + "/n" + clueX
        + "/nR-Return to the Game Menu");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        char choice = value.charAt(0);
        if (choice == 'R') {
            this.returnToMenu();
        }
        else {
            System.out.println("\n*** Invalid Input Please Try Again ***");
        }
    return true;}
    private void returnToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
}
