package com.reedbuck;

/**
 * Created by saikumar on 1/9/16 at 2:06 PM.
 */
public class Customer extends Person{
    protected double balance;
    protected final double limit=10000;

    public Customer(String name, int id, double balance) {
        super(name, id);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double withdrawMoney(int amount){
        try {
            if ((this.balance<=amount)&&(amount<=10000)){
                throw new LowBalanceException();
            }
            if (amount>10000){
                throw new AboveLimitException();
            }
            this.balance-=amount;
        }catch (LowBalanceException | AboveLimitException e){
            System.out.println(e);
            System.out.println("Please verify your details");
        }finally {
            return this.balance;
        }
    }
    public double depositMoney(int amount){
        if (amount>0) {
            this.balance += amount;
        }
        return this.balance;
    }
    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                ", Balance=" + this.getBalance()+
                '}';
    }
}
