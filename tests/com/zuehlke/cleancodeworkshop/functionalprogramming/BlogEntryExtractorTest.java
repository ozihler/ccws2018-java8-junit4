package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("A blog entry extractor")
public class BlogEntryExtractorTest {

    @Nested
    @DisplayName("when extracting blog entries from authors by company")
    class whenExtractingWithAuthorsByCompany {

        private BlogEntryExtractor blogEntryExtractor;

        @BeforeEach
        public void init() {
            blogEntryExtractor = new BlogEntryExtractor();
        }

        @Test
        @DisplayName("returns all blog entries for all authors part of the specified company")
        public void testExtractBlogEntriesFromAuthorsByCompany() {
            var author1 = new Author(
                    "zuehlke",
                    Arrays.asList(
                            new BlogEntry("First Entry", "This is the text to my first entry"),
                            new BlogEntry("Second Entry", "This is the text to my second entry"),
                            new BlogEntry("Third Entry", "This is the text to my third entry")
                    )
            );
            var author2 = new Author(
                    "zuehlke",
                    Arrays.asList(
                            new BlogEntry("Programming with Python", "Programming is hard"),
                            new BlogEntry("Refactoring with Python", "Refactoring is even harder"),
                            new BlogEntry("Testing with Python", "Forget about testing"),
                            new BlogEntry("I give up", "Why Python isn't a real programming language")
                    )
            );
            var author3 = new Author(
                    "awesome-company",
                    Arrays.asList(
                            new BlogEntry("My awesome entry", "this is an awesome entry"),
                            new BlogEntry("My second awesome entry", "this is an even more awesome entry")
                    )
            );

            var authors = Arrays.asList(author1, author2, author3);

            ArrayList<BlogEntry> allEntries = blogEntryExtractor.extractBlogEntriesFrom(authors, "zuehlke");

            assertEquals(7, allEntries.size());

        }

    }
}