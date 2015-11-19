/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Douglas
 */
public class HidingPlaces implements Serializable{
    
    private String unlocked;
    private String description;
    private String content;
    private IslandLocation islandLocation;
    public HidingPlaces() {
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
