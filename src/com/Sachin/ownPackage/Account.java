package com.Sachin.ownPackage;

import java.util.ArrayList;

class Account {
    private int balance;
    private String accountName;
    /**
     * making a array that will store all the transaction in an array form
     * */

    private ArrayList<Integer> transaction;

    public Account( String accountName) {
        //this.balance = balance;
        this.accountName = accountName;
        this.transaction = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            transaction.add(amount);
            this.balance+=amount;
            System.out.println(amount+" deposited.Balance is now :"+this.balance);

        }else {
            System.out.println("Can't add negative amount");
        }
    }
    /**
     * this.balance saves all the total amount in the array
     * and the transaction saves all the transactioni in the array form
     * */

    public void withdrawal(int amount){
        int withdraw =-amount;
        if(withdraw<0){
            transaction.add(withdraw);
            this.balance+=withdraw;
            System.out.println(amount+"deposited.Balance is now :"+this.balance);
        }
        else {
            System.out.println("Can't withdraw negative amount");
        }
    }
    public void calculateBalance(){
        this.balance=0;
        for(int i:this.transaction){
            this.balance +=i;
        }
        System.out.println("Checking from the class"+this.balance);
    }
}
