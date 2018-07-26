package com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator;

import com.zuehlke.cleancodeworkshop.examples.Session;

public class DataOverview2 {
    public static void main(String[] args) {
        Session session = new Session();
        String collaboratorId = session.getLoggedInCollabId();
        int otherCompanyNumber = session.getSelectedCompanyId();

        CollaborationValidatorWithClarifyingComments collaborationValidator = new CollaborationValidatorWithClarifyingComments(session);
        boolean isValid = collaborationValidator.validate(collaboratorId, otherCompanyNumber);

        if (isValid) {
            // show data overview
        }else {
            // show error message
        }
    }
}
