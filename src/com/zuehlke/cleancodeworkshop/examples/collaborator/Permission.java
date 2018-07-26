package com.zuehlke.cleancodeworkshop.examples.collaborator;

public enum Permission {
    BUSINESS_ACCESS("B_A");

    private String name;

    Permission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
