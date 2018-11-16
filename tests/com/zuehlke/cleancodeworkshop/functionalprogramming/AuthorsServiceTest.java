package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AuthorsServiceTest {

    private AuthorsService authorsService;

    @Before
    public void init() {
        authorsService = new AuthorsService(AuthorsFixtures.asSet());
    }

    @Test
    public void testExtractCompanyNames() {
        assertEquals(2, authorsService.getAllCompanyNames().size());
        assertTrue(authorsService.getAllCompanyNames().contains("zuehlke"));
        assertTrue(authorsService.getAllCompanyNames().contains("awesome-company"));
    }

    @Test
    public void testExtractBlogEntriesFromAuthorsByCompany() {
        assertEquals(7, authorsService.getAllBlogEntriesFor("zuehlke").size());
    }

    @Test
    public void testExtractBlogEntriesFromAuthors() {
        assertEquals(9, authorsService.getAllBlogEntries().size());
    }

    @Test
    public void thenAllBlogEntryTitlesAreReturned() {
        assertEquals(8, authorsService.getAllBlogEntryTitles().size());

        AuthorsFixtures.asSet()
                .stream()
                .filter(Objects::nonNull)
                .map(Author::getBlogEntries)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(Objects::nonNull)
                .map(BlogEntry::getTitle)
                .filter(Objects::nonNull)
                .map(authorsService.getAllBlogEntryTitles()::contains)
                .forEach(Assert::assertTrue);
    }


}