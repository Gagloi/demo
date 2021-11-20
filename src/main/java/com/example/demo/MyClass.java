package com.example.demo;

import java.time.Instant;

public class MyClass {

    private String name;

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    private Instant date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public MyClass(String name, Instant date) {
        this.name = name;
        this.date = date;
    }
}
