package oopsExcercises;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Accounts> acc_collection;

    public Bank() {
        acc_collection = new ArrayList<Accounts>();
    }
    public ArrayList<Accounts> getAcc_collection() {
        return acc_collection;
    }
    public void addAccounts(Accounts acc){
         acc_collection.add(acc);
    }
    public void removeAccount(Accounts acc){
        acc_collection.remove(acc);
    }

    public void deposit (Accounts acc, int money){
        acc.deposit(money);
    }

    public void withdraw(Accounts acc, int money){
        acc.withdraw(money);
    }
    public ArrayList<Accounts> getAllaccounts(){
        return acc_collection;
    }
}
