/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import java.io.Serializable;
import java.util.Objects;
import treasureHunt.TreasureHunt;

/**
 *
 * @author Douglas
 */
public class HidingPlaces implements Serializable{
    
    private String unlocked;
    private String description;
    private String content;
    private IslandLocation islandLocation;
    private String mapSymbol;
    private boolean blocked;
    public HidingPlaces() {
        this.unlocked = "You have found the next clue!";
        this.description = "Ooh, shiny!";
        this.content = "1 piece of the puzzle!";
    }
    public static HidingPlaces[] createHidingPlaces() {
        Game game = TreasureHunt.getCurrentGame();
        HidingPlaces[] hidingPlaces = new HidingPlaces[HidingPlacesType.values().length];
        HidingPlaces firstHidingPlace = new HidingPlaces();
        firstHidingPlace.setDescription(
            "/nHere you are at Island X.  It's not named because it's so small.  You have looked"
            + " around and found the first clue on your way to find Captain Jimmie Raven's treasure."
            + "  It says that the next clue lies in Fiji.  Go on your way to find the rest of the "
            + "clues.  Good luck.  You're going to need it.");
        firstHidingPlace.setMapSymbol(" ST ");
        firstHidingPlace.setBlocked(false);
        hidingPlaces[HidingPlacesType.start.ordinal()] = firstHidingPlace;
        HidingPlaces lastHidingPlace = new HidingPlaces();
        lastHidingPlace.setDescription(
            "/nYou have found the treasure!!  Hoards of gold doubloons, rubies, emeralds, pearls, "
            + "silver chalices, and necklaces and bracelets of every shape and size.  You are the "
            + "ultimate treasure hunter!!");
        lastHidingPlace.setMapSymbol(" END ");
        lastHidingPlace.setBlocked(false);
        hidingPlaces[HidingPlacesType.end.ordinal()] = firstHidingPlace;
        return null;
    }

    private void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    private void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public enum HidingPlacesType {
        start,
        ocean,
        Fiji,
        Volcano,
        Hawaii,
        Kawaii,
        Kuna,
        Mali,
        Colorado,
        Idaho,
        Samoa,
        Tonga,
        Tasmania,
        Maltese,
        McDonald,
        Arizona,
        Transylvania,
        Maui,
        York,
        Rhode,
        Rexburg,
        Meridian,
        Amazon,
        Brobdingnag,
        Lilliput,
        end;
    }
    public String getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(String unlocked) {
        this.unlocked = unlocked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public IslandLocation getIslandLocation() {
        return islandLocation;
    }

    public void setIslandLocation(IslandLocation islandLocation) {
        this.islandLocation = islandLocation;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.unlocked);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.content);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HidingPlaces other = (HidingPlaces) obj;
        if (!Objects.equals(this.unlocked, other.unlocked)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HidingPlaces{" + "unlocked=" + unlocked + ", description=" + description + ", content=" + content + '}';
    }
}