package rules;

import model.User;
import model.Voucher;

public interface Rule {

    boolean validate(Voucher voucher, User user);

}
