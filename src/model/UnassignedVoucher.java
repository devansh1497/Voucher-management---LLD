package model;

import rules.Rule;

import java.util.List;

public class UnassignedVoucher extends Voucher {
    public UnassignedVoucher(List<Rule> rules, String content) {
        super(rules, content);
    }
}
