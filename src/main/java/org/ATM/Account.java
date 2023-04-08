package org.ATM;

import java.util.ArrayList;

public class Account {
    private String name;

    private String uuId;

    private User holder;

    private ArrayList<Transaction> transactions;

    public String getUUID() {
        return uuId;
    }

    public Account(String name, User holder, Bank theBank) {
        this.name = name;

        this.holder = holder;

        this.uuId = theBank.getNewUserUUID();

        this.transactions = new ArrayList<Transaction>();

        holder.addAccount(this);
        theBank.addAccount(this);

    }

}
