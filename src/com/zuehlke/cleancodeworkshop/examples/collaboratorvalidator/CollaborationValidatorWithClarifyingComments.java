package com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator;

import com.zuehlke.cleancodeworkshop.examples.RolerCoasterApi;
import com.zuehlke.cleancodeworkshop.examples.Session;
import com.zuehlke.cleancodeworkshop.examples.collaborator.Context;

import java.util.Map;
import java.util.Set;

public class CollaborationValidatorWithClarifyingComments {
    private Session session;

    public CollaborationValidatorWithClarifyingComments(Session session) {
        this.session = session;
    }

    /**
     * validates if a collaborator with id collabId is allowed to
     * view and edit data of another company represented by compNr)
     *
     * @return true if collaborator is allowed to view and edit data
     * (or it's not an external collaborator), false otherwise
     */
    public boolean validate(String collabId, int compNr) {
        // The same view is used in multiple contexts. The validation only applies to
        // collaborators (all internals can access the data directly). Thus,
        // check if context is EXT_COLLAB_DAT_VE (business calls it "collaborator context")
        if (session.getContext() == Context.EXT_COLLAB_DAT_VE) {
            // check if the collaborator has a business relationship with the company.
            // This is done by checking for permission DAT_VE (data view and edit permission)
            // using the PermissionApi provided by system GreenAdentity
            Map<Integer, Set<String>> permissions = PermissionsApi.getAllPermissions(collabId);
            if (permissions.containsKey(compNr) && permissions.get(compNr).contains("B_A")) {
                // to view and edit data of a company, the collaborator needs to have Data Administrator role.
                // This is represented by the "CONF_CUS" (configure customer) role from system RolerCoaster
                Set<String> roles = RolerCoasterApi.getAllRoles(collabId);
                if (roles.contains("CONF_CUS")) {
                    // collaborator has business relation with company
                    // and logged in collaborator is allowed to view and edit the data of the company.
                    return true;
                } else {
                    // collaborator is missing the required role to view and edit data of the company
                    return false;
                }
            } else {
                // no business relation found between collaborator and company
                return false;
            }
        } else {
            //not an external collaborator: no validation needed
            return true;
        }
    }
}
