package rules;

import model.User;
import model.Voucher;

public class MoreThanCartValue implements Rule {

    private double cartValue;

    public MoreThanCartValue(double cartValue) {
        this.cartValue = cartValue;
    }

    @Override
    public boolean validate(Voucher voucher, User user) {
        return user.getCart().totalValue() > cartValue;
    }
}
