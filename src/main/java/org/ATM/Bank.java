package org.ATM;

import java.util.ArrayList;

public class Bank {
    private String name;

    private ArrayList<User> user;

    private ArrayList<Account> accounts;

    public String getNewUserUUID() {
        return null;
    }

    public String getNewAccountUUID() {
        return null;
    }

    public void addAccount(Account anAcct) {
        this.accounts.add(anAcct);
    }


}
