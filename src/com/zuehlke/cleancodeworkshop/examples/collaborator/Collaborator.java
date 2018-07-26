package com.zuehlke.cleancodeworkshop.examples.collaborator;

public class Collaborator {
    private final CollaboratorId id;
    private final Roles roles;
    private final Permissions permissions;

    public static Collaborator of(String collaboratorId) {
        return new Collaborator(CollaboratorId.of(collaboratorId));
    }

    private Collaborator(CollaboratorId collaboratorId) {
        this(collaboratorId,
                Roles.of(collaboratorId),
                Permissions.of(collaboratorId));
    }

    Collaborator(CollaboratorId id, Roles roles, Permissions permissions) {
        this.id = id;
        this.roles = roles;
        this.permissions = permissions;
    }

    public boolean canViewAndEditDataOf(Company company) {
        return hasBusinessRelationshipWith(company) && isDataAdministrator();
    }

    public boolean hasBusinessRelationshipWith(Company company) {
        return permissions.hasBusinessRelationshipWith(company);
    }

    public boolean isDataAdministrator() {
        return roles.isDataAdministrator();
    }

    public int getId() {
        return id.intValue();
    }
}
