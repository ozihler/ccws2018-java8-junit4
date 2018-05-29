package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.jupiter.api.*;

import java.util.Collection;
import java.util.Objects;

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
            assertEquals(2, authorsService.getAllCompanyNames().size());
            assertTrue(authorsService.getAllCompanyNames().contains("zuehlke"));
            assertTrue(authorsService.getAllCompanyNames().contains("awesome-company"));
        }
    }

    @Nested
    @DisplayName("When getting blog entries for a specified company")
    class whenExtractingWithAuthorsByCompany {
        @Test
        @DisplayName("Then a list of all blog entries of the specified company is returned")
        public void testExtractBlogEntriesFromAuthorsByCompany() {
            assertEquals(7, authorsService.getAllBlogEntriesFor("zuehlke").size());
        }
    }

    @Nested
    @DisplayName("When getting all blog entries")
    class whenGettingAllBlockEntries {
        @Test
        @DisplayName("Then a list of all blog entries is returned")
        public void testExtractBlogEntriesFromAuthorsByCompany() {
            assertEquals(9, authorsService.getAllBlogEntries().size());
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