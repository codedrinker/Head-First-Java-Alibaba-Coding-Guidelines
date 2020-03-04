package com.github.codedrinker.p1413;

public class User implements java.io.Serializable {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
