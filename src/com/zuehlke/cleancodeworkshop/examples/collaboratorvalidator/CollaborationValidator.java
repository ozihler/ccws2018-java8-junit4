package com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator;

import com.zuehlke.cleancodeworkshop.examples.RolerCoasterApi;
import com.zuehlke.cleancodeworkshop.examples.Session;
import com.zuehlke.cleancodeworkshop.examples.collaborator.Context;

import java.util.Map;
import java.util.Set;

public class CollaborationValidator {
    private Session session;

    public CollaborationValidator(Session session) {
        this.session = session;
    }

    public boolean validate(String collabId, int compNr) {
        if (session.getContext() == Context.EXT_COLLAB_DAT_VE) {
            Map<Integer, Set<String>> permissions = PermissionsApi.getAllPermissions(collabId);
            if (permissions.containsKey(compNr) && permissions.get(compNr).contains("B_A")) {
                Set<String> roles = RolerCoasterApi.getAllRoles(collabId);
                if (roles.contains("CONF_CUS")) return true;
                else return false;
            } else return false;
        } else return true;
    }
}
