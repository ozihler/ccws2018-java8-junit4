package com.zuehlke.cleancodeworkshop.examples.collaborator;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Permissions {
    private Map<CompanyId, Set<Permission>> permissions;

    public static Permissions of(CollaboratorId collaboratorId) {
        return new Permissions(GreenAdentityPermissionsApi.getPermissionsToOtherCompaniesOf(collaboratorId));
    }

    Permissions(Map<CompanyId, Set<Permission>> permissions) {
        this.permissions = permissions;
    }

    public boolean hasBusinessRelationshipWith(Company company) {
        return permissionsOf(company).contains(Permission.BUSINESS_ACCESS);
    }

    private Set<Permission> permissionsOf(Company company) {
        if (permissions.containsKey(company.getId())) {
            return permissions.get(company.getId());
        }

        return Collections.EMPTY_SET;
    }

}
