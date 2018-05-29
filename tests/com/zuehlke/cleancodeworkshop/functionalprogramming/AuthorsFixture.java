package com.zuehlke.cleancodeworkshop.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class AuthorsFixture {

    public static final Author AUTHOR_1 = new Author(
            "zuehlke",
            Arrays.asList(
                    new BlogEntry("First Entry", "This is the text to my first entry"),
                    new BlogEntry("Second Entry", "This is the text to my second entry"),
                    new BlogEntry("Third Entry", "This is the text to my third entry")
            )
    );

    public static final Author AUTHOR_2 = new Author(
            "zuehlke",
            Arrays.asList(
                    new BlogEntry("Programming with Python", "Programming is hard"),
                    new BlogEntry("Refactoring with Python", "Refactoring is even harder"),
                    new BlogEntry("Testing with Python", "Forget about testing"),
                    new BlogEntry("I give up", "Why Python isn't a real programming language")
            )
    );

    public static final Author AUTHOR_3 = new Author(
            "awesome-company",
            Arrays.asList(
                    new BlogEntry("My awesome entry", "this is an awesome entry"),
                    new BlogEntry("My second awesome entry", "this is an even more awesome entry")
            )
    );

    public static List<Author> asList() {
        return Arrays.asList(AUTHOR_1, AUTHOR_2, AUTHOR_3);
    }
}
