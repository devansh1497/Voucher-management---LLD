package rules;

import model.User;
import model.Voucher;

import java.util.stream.Collectors;

public class Validator {

    public static boolean validate(Voucher voucher, User user) {
        return !voucher.getRules().stream().map(rule -> rule.validate(voucher, user)).collect(Collectors.toSet())
                .contains(false);
    }
}
