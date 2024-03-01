package model;

import rules.AssignedVoucherRule;
import rules.Rule;

import java.util.List;
import java.util.UUID;

public class AssignedVoucher extends Voucher {

    private UUID userId;

    public AssignedVoucher(UUID userId, List<Rule> rules, String content) {
        super(rules, content);
        this.userId = userId;
        this.getRules().add(new AssignedVoucherRule());
    }

    public UUID getUserId() {
        return userId;
    }
}
