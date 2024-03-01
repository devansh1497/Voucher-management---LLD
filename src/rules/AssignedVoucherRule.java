package rules;

import model.AssignedVoucher;
import model.User;
import model.Voucher;

public class AssignedVoucherRule implements Rule {

    @Override
    public boolean validate(Voucher voucher, User user) {
        return user.getId().equals(((AssignedVoucher)voucher).getUserId());
    }
}
