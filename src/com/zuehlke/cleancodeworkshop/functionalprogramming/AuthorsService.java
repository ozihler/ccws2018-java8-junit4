package com.zuehlke.cleancodeworkshop.functionalprogramming;

import java.util.*;

public class AuthorsService {
    private List<Author> authors;

    public AuthorsService(List<Author> authors) {
        this.authors = authors;
    }

    public Set<String> getAllCompanyNames(){
        Set<String> allCompanies = new HashSet<>();
        for (var author : authors) {
            if (author.getCompany() != null) {
                allCompanies.add(author.getCompany());
            }
        }

        return allCompanies;
    }

    public List<BlogEntry> getAllBlogEntriesFor(String company) {
         var allBlogEntries = new ArrayList<BlogEntry>();

        for (var author : authors) {
            if (author.getCompany().equalsIgnoreCase(company)) {
                var blogEntries = author.getBlogEntries();
                if (blogEntries != null) {
                    allBlogEntries.addAll(blogEntries);
                }
            }
        }

        return allBlogEntries;
    }

}
