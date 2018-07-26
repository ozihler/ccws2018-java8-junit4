package com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator;

import com.zuehlke.cleancodeworkshop.examples.Session;

import java.util.Map;
import java.util.Set;

public class PermissionsApi {
    public static Map<Integer, Set<String>> getAllPermissions(String collabId) {
        return Map.of(new Session().getSelectedCompanyId(), Set.of("DATA_CONFIG", "OTHER", "OTHER2"));
    }
}
