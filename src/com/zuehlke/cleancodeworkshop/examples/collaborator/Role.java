package com.zuehlke.cleancodeworkshop.examples.collaborator;

public enum Role {
    DATA_ADMINISTRATOR("CONF_CUS");

    private String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
