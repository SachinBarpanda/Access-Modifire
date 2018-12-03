package com.Sachin.great;

public class StaticInitialize {
    public static final String owner;

    static {
        owner="Sachin";
        System.out.println("Static initializer block called");
    }
    public StaticInitialize(){
        System.out.println("Class named constructor is called");

    }
    static {
        System.out.println("2nd initializer block is callled");

    }
    public void someMethod(){
        System.out.println("somemethod called");
    }
}
