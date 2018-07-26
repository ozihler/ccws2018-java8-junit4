package com.zuehlke.cleancodeworkshop.examples;

import com.zuehlke.cleancodeworkshop.examples.collaborator.CollaboratorId;
import com.zuehlke.cleancodeworkshop.examples.collaborator.Role;

import java.util.Set;
import java.util.stream.Collectors;

public class RolerCoasterApi {
    public static Set<String> getAllRoles(String collabId) {
        return Set.of("CONFIG_CUSTOMER", "ROLE2", "ROLE3");
    }

    public static Set<Role> getRolesOf(CollaboratorId collaboratorId) {
        return getAllRoles(collaboratorId.stringValue())
                .stream()
                .map(Role::valueOf)
                .collect(Collectors.toSet());
    }
}
