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
class GetWoodView extends View{

    public GetWoodView(String promptMessage) {
        super(promptMessage);
    }
    public void displayMenu() {
        this.console.println("Display the Get Wood View");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
