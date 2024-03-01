package model;

import java.util.UUID;

public class User {

    private UUID id;
    private int age;
    private String fullName;

    private Cart cart;

    public User(int age, String fullName) {
        this.id = UUID.randomUUID();
        this.age = age;
        this.fullName = fullName;
        this.cart = new Cart(this);
    }

    public UUID getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public Cart getCart() {
        return cart;
    }
}
