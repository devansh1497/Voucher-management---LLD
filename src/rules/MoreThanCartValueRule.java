package rules;

import model.User;
import model.Voucher;

public class MoreThanCartValueRule implements Rule {

    private double cartValue;

    public MoreThanCartValueRule(double cartValue) {
        this.cartValue = cartValue;
    }

    @Override
    public boolean validate(Voucher voucher, User user) {
        return user.getCart().totalValue() > cartValue;
    }
}
