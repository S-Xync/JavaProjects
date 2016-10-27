package com.reedbuck;

public class Main {

    public static void main(String[] args) {
        Bank bank =new Bank("State Bank of India");
        bank.addBranch("Vijayawada");
        bank.addCustomer("Vijayawada","SaiKumar",200.05);
        bank.addCustomer("Vijayawada","Vineesha",150.50);
        bank.addCustomer("Vijayawada","Tim",50);
        bank.addBranch("Guwahati");
        bank.addCustomer("Guwahati","Vishnu",5);
        bank.addCustomer("Guwahati","Jayashree",10.06);

        bank.addCustomerTransaction("Vijayawada","Vineesha",25);
        bank.listCustomers("Guwahati",false);
        bank.listCustomers("Vijayawada",true);

    }
}
