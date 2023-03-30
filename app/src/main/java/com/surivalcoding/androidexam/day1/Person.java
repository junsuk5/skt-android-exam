package com.surivalcoding.androidexam.day1;

interface Named {
    String getName();
}

public class Person {
    public static int MAX_HP = 50;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
