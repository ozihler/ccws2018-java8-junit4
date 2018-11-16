package com.zuehlke.cleancodeworkshop.functionalprogramming;


import java.util.HashSet;
import java.util.Set;

public class AuthorsService {
    private Set<Author> authors;

    public AuthorsService(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<String> getAllCompanyNames() {
        Set<String> allCompanies = new HashSet<>();

        for (Author author : authors) {
            if (author != null) {
                if (author.getCompany() != null && !author.getCompany().isEmpty()) {
                    allCompanies.add(author.getCompany());
                }
            }
        }

        return allCompanies;
    }

    public Set<BlogEntry> getAllBlogEntries() {
        Set<BlogEntry> allBlogEntries = new HashSet<>();

        for (Author author : authors) {
            if (author != null) {
                Set<BlogEntry> blogEntries = author.getBlogEntries();
                if (blogEntries != null) {
                    for (BlogEntry blogEntry : blogEntries) {
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
        Set<BlogEntry> allBlogEntries = new HashSet<BlogEntry>();

        for (Author author : authors) {
            if (author != null) {
                if (author.worksFor(company)) {
                    Set<BlogEntry> blogEntries = author.getBlogEntries();
                    if (blogEntries != null) {
                        for (BlogEntry blogEntry : blogEntries) {
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
        Set<String> allBlogEntryTitles = new HashSet<String>();

        for (Author author : authors) {
            if (author != null) {
                if (author.getBlogEntries() != null) {
                    for (BlogEntry blogEntry : author.getBlogEntries()) {
                        if (blogEntry != null) {
                            String title = blogEntry.getTitle();
                            if (title != null && !title.isEmpty()) {
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
