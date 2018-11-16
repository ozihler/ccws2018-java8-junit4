package com.zuehlke.cleancodeworkshop.person;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategyFactory {
    protected static List<String> surnameFirst = new ArrayList<>();

    static {
        PersonNameStrategyFactory.surnameFirst.add("CHN");
        PersonNameStrategyFactory.surnameFirst.add("KOR");
        // etc...
    }

    public static PersonNameStrategy create(String nationality, boolean capitalizeSurname, boolean olympicMode) {
        if (olympicMode) {
            return new OlympicPersonNameStrategy(capitalizeSurname, surnameFirst.contains(nationality));
        }
        return new DefaultPersonNameStrategy(capitalizeSurname);
    }
}
