package oopsExcercises;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        Accounts account1 = new Accounts("Prateek",122, 1000);
        b.addAccounts(account1);
        ArrayList<Accounts> accounts = b.getAllaccounts();
        for(Accounts ac : accounts){
            System.out.println(ac.getAccountInfo());
        }
        b.deposit(account1,1000);
        for(Accounts ac : accounts){
            System.out.println(ac.getAccountInfo());
        }
    }
}
