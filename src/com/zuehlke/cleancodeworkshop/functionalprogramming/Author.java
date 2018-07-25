package com.zuehlke.cleancodeworkshop.functionalprogramming;

import java.util.Set;

public class Author {
    private String company;
    private Set<BlogEntry> blogEntries;

    public Author(String company, Set<BlogEntry> blogEntries) {
        this.company = company;
        this.blogEntries = blogEntries;
    }

    public String getCompany() {
        return this.company;
    }

    public Set<BlogEntry> getBlogEntries() {
        return blogEntries;
    }

    public boolean worksFor(String company) {
        return getCompany().equalsIgnoreCase(company);
    }
}
