package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.jupiter.api.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//instead of junit5: useful naming standards for unit tests: http://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
@DisplayName("Given an AuthorService")
public class AuthorsServiceTest {

    private AuthorsService authorsService;

    @BeforeEach
    public void init() {
        authorsService = new AuthorsService(AuthorsFixtures.asList());
    }

    @Nested
    @DisplayName("When getting all companies")
    class whenExtractingAllCompanies {
        @Test
        @DisplayName("Then a set of all existing companies is returned")
        public void testExtractCompanyNames() {
            Set<String> allCompanyNames = authorsService.getAllCompanyNames();

            assertEquals(2, allCompanyNames.size());
            assertTrue(allCompanyNames.contains("zuehlke"));
            assertTrue(allCompanyNames.contains("awesome-company"));
        }
    }

    @Nested
    @DisplayName("When getting blog entries for a specified company")
    class whenExtractingWithAuthorsByCompany {
        @Test
        @DisplayName("Then a list of all blog entries of the specified company is returned")
        public void testExtractBlogEntriesFromAuthorsByCompany() {
            List<BlogEntry> allEntries = authorsService.getAllBlogEntriesFor("zuehlke");

            assertEquals(7, allEntries.size());
        }
    }

    @Nested
    @DisplayName("When getting all blog entries")
    class whenGettingAllBlockEntries {
        @Test
        @DisplayName("Then a list of all blog entries is returned")
        public void testExtractBlogEntriesFromAuthorsByCompany() {
            List<BlogEntry> allEntries = authorsService.getAllBlogEntries();

            assertEquals(9, allEntries.size());
        }
    }

    @Nested
    @DisplayName("When getting all blog entry titles")
    class whenGettingBlogEntryTitles {
        @Test
        @DisplayName("Then a set of all blog entry titles is returned")
        public void thenAllBlogEntryTitlesAreReturned() {
            assertEquals(9, authorsService.getAllBlogEntryTitles().size());

            AuthorsFixtures.asList()
                    .stream()
                    .map(Author::getBlogEntries)
                    .filter(Objects::nonNull)
                    .flatMap(Collection::stream)
                    .map(BlogEntry::getTitle)
                    .map(authorsService.getAllBlogEntryTitles()::contains)
                    .forEach(Assertions::assertTrue);
        }
    }


}