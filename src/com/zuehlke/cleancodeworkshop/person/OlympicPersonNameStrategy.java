package com.zuehlke.cleancodeworkshop.person;

public class OlympicPersonNameStrategy extends PersonNameStrategy {

    private boolean isSurnameFirst;

    public OlympicPersonNameStrategy(boolean capitalizeSurname, boolean isSurnameFirst) {
        super(capitalizeSurname, true);
        this.isSurnameFirst = isSurnameFirst;
    }

    @Override
    public String nameString(String familyName, String givenName) {
        if (isSurnameFirst) {
            return capitalizeIfNeeded(familyName) + " " + givenName;
        } else {
            return givenName + " " + capitalizeIfNeeded(familyName);
        }
    }

}
