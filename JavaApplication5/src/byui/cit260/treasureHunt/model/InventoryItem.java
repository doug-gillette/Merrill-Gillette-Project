/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureHunt.model;
import byui.cit260.treasureHunt.control.GameControl;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Jake
 */
public class InventoryItem implements Serializable{
    private String inventoryType;
    private double quantityInStock;
    private static class Constants {
        private static final int NUMBER_OF_INVENTORY_ITEMS = 7;

        public Constants() {
        }
    }
    InventoryItem() {
        this.inventoryType = "coconut";
        this.quantityInStock = 0;
    }
    public enum Item {
    coconut,
    fish,
    water,
    wood,
    hammer,
    saw,
    spyglass;
    }
    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[InventoryItem.Constants.NUMBER_OF_INVENTORY_ITEMS];
        InventoryItem coconut = new InventoryItem();
        coconut.setInventoryType("Coconut");
        coconut.setQuantityInStock(0);
        inventory[InventoryItem.Item.coconut.ordinal()] = coconut;
        InventoryItem fish = new InventoryItem();
        fish.setInventoryType("Fish");
        fish.setQuantityInStock(0);
        inventory[InventoryItem.Item.fish.ordinal()] = fish;
        InventoryItem water = new InventoryItem();
        water.setInventoryType("Water");
        water.setQuantityInStock(0);
        inventory[InventoryItem.Item.water.ordinal()] = water;
        InventoryItem wood = new InventoryItem();
        wood.setInventoryType("Wood");
        wood.setQuantityInStock(0);
        inventory[InventoryItem.Item.wood.ordinal()] = wood;
        InventoryItem hammer = new InventoryItem();
        hammer.setInventoryType("Hammer");
        hammer.setQuantityInStock(0);
        inventory[InventoryItem.Item.hammer.ordinal()] = hammer;
        InventoryItem saw = new InventoryItem();
        saw.setInventoryType("Saw");
        saw.setQuantityInStock(0);
        inventory[InventoryItem.Item.saw.ordinal()] = saw;
        InventoryItem spyglass = new InventoryItem();
        spyglass.setInventoryType("Spyglass");
        spyglass.setQuantityInStock(0);
        inventory[InventoryItem.Item.spyglass.ordinal()] = spyglass;
        return inventory;
    }
    
    
    public String getInventoryType() {
        return inventoryType;
    }
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }
    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.inventoryType);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + '}';
    }

    
    
}
