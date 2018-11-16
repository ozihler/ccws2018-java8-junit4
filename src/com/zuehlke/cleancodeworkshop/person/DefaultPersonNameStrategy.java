package com.zuehlke.cleancodeworkshop.person;

public class DefaultPersonNameStrategy extends PersonNameStrategy {
    public DefaultPersonNameStrategy(boolean capitalizeSurname) {
        super(capitalizeSurname,false);
    }

    @Override
    public String nameString(String familyName, String givenName) {
        return givenName + " " + capitalizeIfNeeded(familyName);
    }

}
