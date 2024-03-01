package rules;

import model.User;
import model.Voucher;

public class LessThanAgeRule implements Rule {

    private int age;

    public LessThanAgeRule(int age) {
        this.age = age;
    }

    @Override
    public boolean validate(Voucher voucher, User user) {
        return user.getAge() < this.age;
    }
}
