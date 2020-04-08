package ItemsProject;

import java.util.List;

public class Item {


    /*
    There are three items to purchase - Apple, Milk & News Paper. Every item has price &
    we can purchase multiple quantity of items
    Items can be added to Cart
    The amount could be paid via e-wallet
    so there will be a class called Item and quantity, quantity with be set by builder
    Cart class will do the calculation, based upon the prices, type of item and quantity
    */

    public final ItemType  itemType;
    public final int quantity;

    public Item(ItemBuilder builder) {
        this.itemType = builder.itemType;
        this.quantity = builder.quantity;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemType=" + itemType +
                ", quantity=" + quantity +
                '}';
    }

    public List<Item> allItems() {
        return new ItemDataCreator().createItems();
    }
}
