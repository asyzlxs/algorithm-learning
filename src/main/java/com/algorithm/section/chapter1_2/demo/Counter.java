package com.algorithm.section.chapter1_2.demo;

public class Counter {
    private String name;
    private int count = 0;

    Counter(String id) {
        name = id;
    }

    public void increment() {
        count += 1;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }
}
