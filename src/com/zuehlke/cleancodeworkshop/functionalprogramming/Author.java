package com.zuehlke.cleancodeworkshop.functionalprogramming;

import java.util.List;

public class Author {
    private String company;
    private List<BlogEntry> blogEntries;

    public Author(String company, List<BlogEntry> blogEntries) {
        this.company = company;
        this.blogEntries = blogEntries;
    }

    public String getCompany() {
        return this.company;
    }

    public List<BlogEntry> getBlogEntries() {
        return blogEntries;
    }
}
