package com.reedbuck;

import java.util.ArrayList;

/**
 * Created by saikumar on 10/7/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name,double initialAmount){
        this.name=name;
        this.transactions=new ArrayList<Double>();
        this.transactions.add(initialAmount);
    }
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
