package com.Sachin.ownPackage;

public class Main {

    public static void main(String[] args) {
	    Account savings = new Account ("SAM's account");
	    savings.deposit(100);
	    savings.deposit(200);

	    savings.withdrawal(20);
	    savings.calculateBalance();

        System.out.println("Balance checking in the main class"+ savings.getBalance());
    }
}
