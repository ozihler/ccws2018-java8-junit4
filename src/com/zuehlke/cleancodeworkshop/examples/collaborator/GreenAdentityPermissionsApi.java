package com.zuehlke.cleancodeworkshop.examples.collaborator;

import com.zuehlke.cleancodeworkshop.examples.Session;
import com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator.PermissionsApi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GreenAdentityPermissionsApi {

    public static Map<CompanyId, Set<Permission>> getPermissionsToOtherCompaniesOf(CollaboratorId collaboratorId) {
        Map<Integer, Set<String>> companyConfigurationPermissions = PermissionsApi.getAllPermissions(collaboratorId.stringValue());

        Map<CompanyId, Set<Permission>> permissionsMap = new HashMap<>();
        for (Map.Entry<Integer, Set<String>> entry : companyConfigurationPermissions.entrySet()) {
            Set<Permission> permissions = entry.getValue().stream()
                    .map(Permission::valueOf)
                    .collect(Collectors.toSet());

            permissionsMap.put(CompanyId.of(entry.getKey()), permissions);
        }
        return permissionsMap;
    }
}
