package ItemsProject;

import java.util.ArrayList;
import java.util.List;

public class CartBuilder {

    List<Item> items = new ArrayList<>();
    int totalAmount;



    public CartBuilder byTotalAmount(){
        int totalAmount =0;
        for(Item a:items) {
            totalAmount = totalAmount + a.getQuantity()*a.itemType.price();
        }
        this.totalAmount = totalAmount;
        return  this;
    }

    public CartBuilder listOfItems(List<Item> items){
        this.items = items;
        return this;
    }

    public Cart build() {
        Cart cart = new Cart(this);
        return cart;
    }


}
