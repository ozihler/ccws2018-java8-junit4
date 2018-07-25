package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;

public class AuthorsService {
    private Set<Author> authors;

    public AuthorsService(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<String> getAllCompanyNames() {
        Set<String> allCompanies = new HashSet<>();

        for (var author : authors) {
            if (author != null) {
                if (!StringUtils.isBlank(author.getCompany())) {
                    allCompanies.add(author.getCompany());
                }
            }
        }

        return allCompanies;
    }

    public Set<BlogEntry> getAllBlogEntries() {
        var allBlogEntries = new HashSet<BlogEntry>();

        for (var author : authors) {
            if (author != null) {
                var blogEntries = author.getBlogEntries();
                if (blogEntries != null) {
                    for (var blogEntry : blogEntries) {
                        if (blogEntry != null) {
                            allBlogEntries.add(blogEntry);
                        }
                    }
                }
            }
        }

        return allBlogEntries;
    }

    public Set<BlogEntry> getAllBlogEntriesFor(String company) {
        var allBlogEntries = new HashSet<BlogEntry>();

        for (var author : authors) {
            if (author != null) {
                if (author.worksFor(company)) {
                    var blogEntries = author.getBlogEntries();
                    if (blogEntries != null) {
                        for (var blogEntry : blogEntries) {
                            if (blogEntry != null) {
                                allBlogEntries.add(blogEntry);
                            }
                        }
                    }
                }
            }
        }

        return allBlogEntries;
    }

    public Set<String> getAllBlogEntryTitles() {
        var allBlogEntryTitles = new HashSet<String>();

        for (var author : authors) {
            if (author != null) {
                if (author.getBlogEntries() != null) {
                    for (var blogEntry : author.getBlogEntries()) {
                        if (blogEntry != null) {
                            String title = blogEntry.getTitle();
                            if (!StringUtils.isBlank(title)) {
                                allBlogEntryTitles.add(title);
                            }
                        }
                    }
                }
            }
        }

        return allBlogEntryTitles;
    }

}
