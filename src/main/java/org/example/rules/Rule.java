package org.example.rules;

import org.example.item.Payment;

public abstract class Rule {

    private final String name;
    private final String description;


    public Rule(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract boolean executeRule(Payment payment);

}
