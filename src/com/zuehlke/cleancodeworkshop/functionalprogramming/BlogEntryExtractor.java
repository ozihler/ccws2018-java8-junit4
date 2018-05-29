package com.zuehlke.cleancodeworkshop.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class BlogEntryExtractor {
    public ArrayList<BlogEntry> extractBlogEntriesFrom(List<Author> authors, String company) {
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
