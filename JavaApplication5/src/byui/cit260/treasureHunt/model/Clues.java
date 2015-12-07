
package byui.cit260.treasureHunt.model;

import java.io.Serializable;

public enum Clues implements Serializable{
    Clue1("Clue leading to #2."),
    Clue2("Clue leading to #3."),
    Clue3("Clue leading to #4."),
    Clue4("Clue leading to #5."),
    Clue5("Clue leading to #6."),
    Clue6("Clue leading to #7."),
    Clue7("Clue leading to #8."),
    Clue8("Clue leading to #9."),
    Clue9("Clue leading to #10."),
    Clue10("Clue leading to #11."),
    Clue11("Clue leading to #12."),
    Clue12("Clue leading to #13."),
    Clue13("Clue leading to #14."),
    Clue14("Clue leading to #15."),
    Clue15("Clue leading to #16."),
    Clue16("Clue leading to #17."),
    Clue17("Clue leading to #18."),
    Clue18("Clue leading to #19."),
    Clue19("Clue leading to #20."),
    Clue20("Clue leading to #21."),
    Clue21("Clue leading to #22."),
    Clue22("Clue leading to #23."),
    Clue23("Clue leading to #24.");
    private final String clueDescription;
    private TreasureMap treasureMap;
    Clues(String clueDescription) {
        this.clueDescription = clueDescription;
    }

    public String getClueDescription() {
        return clueDescription;
    }

    public TreasureMap getTreasureMap() {
        return treasureMap;
    }
    
    @Override
    public String toString() {
        return "Clues{" + ", clueDescription=" + clueDescription + '}';
    }
    
    
    
    
}
