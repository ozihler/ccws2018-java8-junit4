package com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator;

import com.zuehlke.cleancodeworkshop.examples.Session;

import java.util.*;

public class PermissionsApi {
    public static Map<Integer, Set<String>> getAllPermissions(String collabId) {
        Map<Integer, Set<String>> allPermissions = new HashMap<>();
        allPermissions.put(new Session().getSelectedCompanyId(), new HashSet<>(Arrays.asList("DATA_CONFIG", "OTHER", "OTHER2")));
        return allPermissions;
    }
}
