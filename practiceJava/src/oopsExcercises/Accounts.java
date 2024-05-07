package oopsExcercises;

import java.util.ArrayList;

public class Accounts{
    private String cust_name;
    private int account_num;
    private int balance;

    public Accounts(String cust_name, int account_num, int balance){
        this.cust_name = cust_name;
        this.account_num = account_num;
        this.balance = balance;
    }
    public String getCust_name(){
        return cust_name;
    }
    public int getAccount_num(){
        return account_num;
    }
    public int getBalance(){
        return balance;
    }

    public int deposit(int money){
        return balance += money;
    }
    public int withdraw(int money){
        return balance -= money;
    }

    public String getAccountInfo(){
        return "name: " + cust_name + " account number: " + account_num + " balace: " + balance;
    }
}

