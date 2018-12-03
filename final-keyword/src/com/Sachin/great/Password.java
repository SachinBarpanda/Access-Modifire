package com.Sachin.great;

public class Password {
    private  static final int key = 9776414;
    private final int encryptedPassword;

   public Password(int password){
       this.encryptedPassword = encryptDecrypt(password);
   }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

   public final void storePassword(){
        System.out.println("Saving password as "+ this.encryptedPassword);
    }

    public boolean letmeIn(int password){
        if(encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }
        else{
            System.out.println("No Entry");
            return false;
        }
    }


}
