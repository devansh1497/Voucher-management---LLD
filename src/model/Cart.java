package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {

    private User user;
    private List<CartItem> cartItems;

    public Cart(User user) {
        this.user = user;
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        this.cartItems.add(new CartItem(product, quantity));
    }

    public double totalValue() {
        return cartItems.stream().map(item -> item.getProduct().getPrice() * item.getQuantity()).mapToDouble(Double::doubleValue).sum();
    }
}
