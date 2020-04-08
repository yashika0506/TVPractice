package ItemsProject;


import java.util.ArrayList;
import java.util.List;

public class ItemDataCreator {

    public List<Item> createItems() {


        Item item1 = new ItemBuilder().itemType(ItemType.APPLE).quantity(2).build();
        Item item2 = new ItemBuilder().itemType(ItemType.MILK).quantity(3).build();
        Item item3 = new ItemBuilder().itemType(ItemType.NEWS_PAPER).quantity(5).build();
        List<Item> list = new ArrayList<Item>();

        list.add(item1);
        list.add(item2);
        list.add(item3);

        return list;
    }


}
