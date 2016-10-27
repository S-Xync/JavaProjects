package com.reedbuck;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer=new Customer("Sai",54.46);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("The balance of "+anotherCustomer.getName()+" is "+anotherCustomer.getBalance());
        ArrayList<Integer> intList=new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i=0;i<intList.size();i++){
            System.out.println(i+" : "+intList.get(i));
        }
        intList.add(1,2);
        for (int i=0;i<intList.size();i++){
            System.out.println(i+" : "+intList.get(i));
        }

    }
}
