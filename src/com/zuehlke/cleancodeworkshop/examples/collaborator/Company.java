package com.zuehlke.cleancodeworkshop.examples.collaborator;

public class Company {
    private CompanyId id;

    public static Company of(int id) {
        return new Company(id);
    }

    private Company(int id) {
        this(CompanyId.of(id));
    }

    public Company(CompanyId id) {
        this.id = id;
    }

    public int getId() {
        return id.intValue();
    }
}
