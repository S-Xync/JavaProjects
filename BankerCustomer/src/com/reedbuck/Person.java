package com.reedbuck;

/**
 * Created by saikumar on 1/9/16 at 2:06 PM.
 */
public class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id;
    }
}
