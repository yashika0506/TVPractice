package ItemsProject;

public class ItemBuilder {

    public  ItemType itemType;
    public  int quantity;



    public ItemBuilder itemType(ItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    public ItemBuilder quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }


    public Item build() {
        Item item = new Item(this);
        return item;
    }
}
