package ItemsProject;

import java.util.List;

public class DecisionMaker {


    public static void main(String[] args) {

//        Item item1 = new ItemBuilder().itemType(ItemType.APPLE).quantity(2).build();
//        Item item2 = new ItemBuilder().itemType(ItemType.MILK).quantity(3).build();
//
//
        List<Item> list = new ItemBuilder().build().allItems();
//        list.add(item1);
//        list.add(item2);
        Cart cart = new CartBuilder().listOfItems(list).byTotalAmount().build();
        System.out.println(cart);
    }
}
