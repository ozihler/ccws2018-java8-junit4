package com.zuehlke.cleancodeworkshop.person;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategy {
    private final String nationality;
    private final boolean capitalizeSurname;
    private final boolean olympicMode;
    private static List<String> surnameFirst = new ArrayList<>();

    static {
        surnameFirst.add("CHN");
        surnameFirst.add("KOR");
        // etc...
    }

    public PersonNameStrategy(String nationality, boolean capitalizeSurname, boolean olympicMode) {
        this.nationality = nationality;
        this.capitalizeSurname = capitalizeSurname;
        this.olympicMode = olympicMode;
    }

    public String nameString(String familyName, String givenName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        if (surnameFirst())
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }

    private boolean surnameFirst() {
        if (!olympicMode)
            return false;
        return surnameFirst.contains(nationality);
    }
}
