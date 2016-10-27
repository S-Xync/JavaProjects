package com.reedbuck;

/**
 * Created by saikumar on 25/8/16 at 2:04 PM.
 */
public class User {
    private String name;
    private double budget;

    public User(String name, double budget) {
        this.name = name;
        this.budget=budget;
    }

    public double getBudget() {
        return budget;
    }
}
