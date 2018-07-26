package com.zuehlke.cleancodeworkshop.examples;

import com.zuehlke.cleancodeworkshop.examples.collaborator.Context;

public class Session {
    public int getSelectedCompanyId() {
        return 12345;
    }

    public String getLoggedInCollabId() {
        return "COLAB-123";
    }

    public Context getContext() {
        return Context.EXT_COLLAB_DAT_VE;
    }

    public boolean isCollaboratorContext() {
        return getContext() == Context.EXT_COLLAB_DAT_VE;
    }
}
