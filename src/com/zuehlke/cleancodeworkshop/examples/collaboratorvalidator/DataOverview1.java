package com.zuehlke.cleancodeworkshop.examples.collaboratorvalidator;

import com.zuehlke.cleancodeworkshop.examples.Session;

public class DataOverview1 {
    public static void main(String[] args) {
        Session session = new Session();
        String collaboratorId = session.getLoggedInCollabId();
        int otherCompanyNumber = session.getSelectedCompanyId();

        CollaborationValidator collaborationValidator = new CollaborationValidator(session);
        boolean isValid = collaborationValidator.validate(collaboratorId, otherCompanyNumber);

        if (isValid) {
            // show data overview
        }else {
            // show error message
        }
    }
}
