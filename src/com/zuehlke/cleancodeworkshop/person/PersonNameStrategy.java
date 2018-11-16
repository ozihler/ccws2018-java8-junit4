package com.zuehlke.cleancodeworkshop.person;

public abstract class PersonNameStrategy {
    protected final boolean capitalizeSurname;
    protected final boolean olympicMode;

    protected PersonNameStrategy(boolean capitalizeSurname, boolean olympicMode) {
        this.capitalizeSurname = capitalizeSurname;
        this.olympicMode = olympicMode;
    }

    public abstract String nameString(String familyName, String givenName);

    protected String capitalizeIfNeeded(String familyName) {
        if (capitalizeSurname) {
            return familyName.toUpperCase();
        }
        return familyName;
    }
}
