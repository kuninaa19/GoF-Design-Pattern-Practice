package com.pattern.gof.adapter;

public class OpenServiceQuery {

    private final String query;

    public OpenServiceQuery(String keyword) {
        this.query = keyword;
    }

    public String getQuery() {
        return query;
    }
}
