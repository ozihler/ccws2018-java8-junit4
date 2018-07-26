package com.zuehlke.cleancodeworkshop.examples.collaborator;

import com.zuehlke.cleancodeworkshop.examples.RolerCoasterApi;

import java.util.Set;

public class Roles {
    private Set<Role> roles;

    public static Roles of(CollaboratorId collaboratorId) {
        return new Roles(RolerCoasterApi.getRolesOf(collaboratorId));
    }

    Roles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isDataAdministrator() {
        return roles.contains(Role.DATA_ADMINISTRATOR);
    }
}
