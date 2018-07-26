package com.zuehlke.cleancodeworkshop.examples.collaborator;

public final class CompanyId {
    private final int id;

    public static CompanyId of(int id) {
        return new CompanyId(id);
    }

    private CompanyId(int id) {
        this.id = id;
    }

    public int intValue() {
        return id;
    }
}
