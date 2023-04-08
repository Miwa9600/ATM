package org.ATM;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private String name;

    private ArrayList<User> user;

    private ArrayList<Account> accounts;

    public String getNewUserUUID() {

        String uuId;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;

        do {

            uuId = "";
            for (int i = 0; i < len; i++) {
                uuId += ((Integer)rng.nextInt(10)).toString();
            }

            nonUnique = false;
            for (User u : this.user) {
                if(uuId.compareTo(u.getUUID()) == 0){
                    nonUnique = true;
                    break;
                }
            }

        } while(nonUnique);

        return uuId;
    }

    public String getNewAccountUUID() {

        String uuId;
        Random rng = new Random();
        int len = 10;
        boolean nonUnique;

        do {

            uuId = "";
            for (int i = 0; i < len; i++) {
                uuId += ((Integer)rng.nextInt(10)).toString();
            }

            nonUnique = false;
            for (Account a : this.accounts) {
                if(uuId.compareTo(a.getUUID()) == 0){
                    nonUnique = true;
                    break;
                }
            }

        } while(nonUnique);

        return uuId;
    }



    public void addAccount(Account anAcct) {
        this.accounts.add(anAcct);
    }


}
