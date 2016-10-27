package com.reedbuck;

/**
 * Created by saikumar on 19/10/16 at 9:23 PM.
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private char sex;

    public Student(int id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
}
