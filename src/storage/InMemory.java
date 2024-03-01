package storage;

import model.AssignedVoucher;
import model.UnassignedVoucher;
import model.User;
import model.Voucher;
import rules.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InMemory {
    public List<User> users = new ArrayList<>();
    public List<Voucher> vouchers = new ArrayList<>();

    public void addUser(String name, int age) {
        this.users.add(new User(age, name));
    }

    public void addUnassignedVoucher(List<Rule> rules, String content) {
        Voucher voucher = new UnassignedVoucher(rules, content);
        this.vouchers.add(voucher);
    }

    public void addAssignedVoucher(UUID id, List<Rule> rules, String content) {
        Voucher voucher = new AssignedVoucher(id, rules, content);
        this.vouchers.add(voucher);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }
}
