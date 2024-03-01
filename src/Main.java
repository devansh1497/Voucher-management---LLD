import model.*;
import rules.LessThanAgeRule;
import rules.MoreThanCartValue;
import rules.Rule;
import service.UserService;
import storage.InMemory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User u1 = new User(20,"devansh singh");

        Rule r1 = new LessThanAgeRule(21);
        Rule r2 = new MoreThanCartValue(500.00);

        Product p1 = new Product("p1", 501);

        u1.getCart().addItem(p1, 1);

        InMemory db = new InMemory();

        db.addAssignedVoucher(u1.getId(), new ArrayList<>(Arrays.asList(r1, r2)),"discount of 20rs" );
        db.addAssignedVoucher(UUID.randomUUID(), new ArrayList<>(Arrays.asList(r1, r2)),"discount of 100rs" );

        UserService us = new UserService(db);

        System.out.println(us.showAllCoupons(u1));
    }
}