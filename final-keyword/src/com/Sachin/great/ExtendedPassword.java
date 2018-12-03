package com.Sachin.great;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }
//
//    public void storePassword(){
//        System.out.println("SAving password as "+ this.decryptedPassword);
//    }

}
