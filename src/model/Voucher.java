package model;

import rules.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Voucher {

    private final UUID id;
    private final List<Rule> rules;
    private String content;

    public Voucher(List<Rule> rules, String content) {
        this.id = UUID.randomUUID();
        this.rules = rules;
        this.content = content;

    }

    public void addRules(List<Rule> rules) {
        this.rules.addAll(rules);
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public List<Rule> getRules() {
        return rules;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "content='" + content + '\'' +
                '}';
    }
}
