package com.zuehlke.cleancodeworkshop.examples.collaborator;

public final class CollaboratorId {
    private final String id;

    public static CollaboratorId of(String id) {
        return new CollaboratorId(id);
    }

    private CollaboratorId(String id) {
        this.id = id;
    }

    public int intValue() {
        return Integer.parseInt(id);
    }

    public String stringValue() {
        return id;
    }
}
