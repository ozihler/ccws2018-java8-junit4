package com.zuehlke.cleancodeworkshop.functionalprogramming;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AuthorsService {
    private List<Author> authors;

    public AuthorsService(List<Author> authors) {
        this.authors = authors;
    }

    public Set<String> getAllCompanyNames() {
        Set<String> allCompanies = new HashSet<>();

        for (var author : authors) {
            if (author != null) {
                if (author.getCompany() != null) {
                    allCompanies.add(author.getCompany());
                }
            }
        }

        return allCompanies;
    }

    public List<BlogEntry> getAllBlogEntries() {
        var allBlogEntries = new ArrayList<BlogEntry>();

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

    public List<BlogEntry> getAllBlogEntriesFor(String company) {
        var allBlogEntries = new ArrayList<BlogEntry>();

        for (var author : authors) {
            if (author != null) {
                if (author.getCompany().equalsIgnoreCase(company)) {
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
