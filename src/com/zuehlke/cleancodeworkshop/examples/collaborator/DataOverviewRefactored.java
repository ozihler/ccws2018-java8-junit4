package com.zuehlke.cleancodeworkshop.examples.collaborator;

import com.zuehlke.cleancodeworkshop.examples.Session;

public class DataOverviewRefactored {
    public static void main(String[] args) {
        Session session = new Session();
        Collaborator collaborator = Collaborator.of(session.getLoggedInCollabId());
        Company company = Company.of(session.getSelectedCompanyId());

        if (session.isCollaboratorContext() && !collaborator.canViewAndEditDataOf(company)) {
            showErrorMessage();
        } else {
            showDataOverview();
        }
    }

    private static void showErrorMessage() {
    }

    private static void showDataOverview() {
    }
}
