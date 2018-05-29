package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Given an AuthorService")
public class AuthorsServiceTest {

    private AuthorsService authorsService;

    @BeforeEach
    public void init() {
        authorsService = new AuthorsService(AuthorsFixture.asList());
    }

    @Nested
    @DisplayName("When getting all companies")
    class whenExtractingAllCompanies {
        @Test
        @DisplayName("Then a set of all existing companies are returned")
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
        @DisplayName("Then a list of all blog entries of the specified company are returned")
        public void testExtractBlogEntriesFromAuthorsByCompany() {
            List<BlogEntry> allEntries = authorsService.getAllBlogEntriesFor("zuehlke");

            assertEquals(7, allEntries.size());
        }
    }


}