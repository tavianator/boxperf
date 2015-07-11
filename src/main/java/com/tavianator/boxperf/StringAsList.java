package com.tavianator.boxperf;

import java.util.AbstractList;

public class StringAsList extends AbstractList<Character> {
    private final String str;

    public StringAsList(String str) {
        this.str = str;
    }

    @Override
    public Character get(int index) {
        return str.charAt(index);
    }

    @Override
    public int size() {
        return str.length();
    }
}
