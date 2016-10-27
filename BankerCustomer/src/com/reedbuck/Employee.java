package com.reedbuck;

import java.util.List;

/**
 * Created by saikumar on 1/9/16 at 2:06 PM.
 */
public class Employee extends Person{
    protected double salary;

    public Employee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public void displayCustomerList(List<Customer> arraylist){
        int i=0;
        for (Customer customer:arraylist) {
            i++;
            System.out.println(i+" : "+customer);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                ", Salary=" + salary +
                '}';
    }
}
