package com.reedbuck;

/**
 * Created by saikumar on 18/8/16 at 2:42 PM.
 */
public interface Account {
    String getAccountType();
    double withdrawMoney(int amount);
    double depositMoney(int amount);
    double getBalance();
}
