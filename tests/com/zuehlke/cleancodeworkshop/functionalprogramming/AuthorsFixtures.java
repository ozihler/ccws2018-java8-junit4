package com.zuehlke.cleancodeworkshop.functionalprogramming;

import java.util.Set;

public class AuthorsFixtures {

    public static final Author AUTHOR_1 = new Author(
            "zuehlke",
            Set.of(
                    new BlogEntry("First Entry", "This is the text to my first entry"),
                    new BlogEntry("Second Entry", "This is the text to my second entry"),
                    new BlogEntry("Third Entry", "This is the text to my third entry")
            )
    );

    public static final Author AUTHOR_2 = new Author(
            "zuehlke",
            Set.of(
                    new BlogEntry("Programming with Python", "Programming is hard"),
                    new BlogEntry("Refactoring with Python", "Refactoring is even harder"),
                    new BlogEntry("Testing with Python", "Forget about testing"),
                    new BlogEntry(null, null)
            )
    );

    public static final Author AUTHOR_3 = new Author(
            "awesome-company",
            Set.of(
                    new BlogEntry("My awesome entry", "this is an awesome entry"),
                    new BlogEntry("My second awesome entry", "this is an even more awesome entry")
            )
    );


    public static final Author AUTHOR_4 = new Author("awesome-company", null);

    public static Set<Author> asSet() {
        return Set.of(AUTHOR_1, AUTHOR_2, AUTHOR_3, AUTHOR_4);
    }
}
