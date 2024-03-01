package service;

import model.User;
import model.Voucher;
import rules.Validator;
import storage.InMemory;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {


    private InMemory storage;
    public UserService(InMemory storage) {
        this.storage = storage;
    }

    public List<Voucher> showAllCoupons(User user) {
        List<Voucher> vouchers = storage.getVouchers();
        return vouchers.stream().filter(voucher -> Validator.validate(voucher, user)).collect(Collectors.toList());
    }
}
