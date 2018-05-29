package com.zuehlke.cleancodeworkshop.functionalprogramming;

public class BlogEntry {
    private String title;
    private String message;

    public BlogEntry(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
