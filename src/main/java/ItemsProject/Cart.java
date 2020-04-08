package ItemsProject;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> items = new ArrayList<>();
    int totalAmount;

    public Cart(CartBuilder builder) {
        this.items = builder.items;
        this.totalAmount = builder.totalAmount;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

