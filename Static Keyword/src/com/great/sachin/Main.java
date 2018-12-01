package com.great.sachin;

public class Main {

    public static int multiplier=9;

    public static void main(String[] args) {

//        StaticTest static1=new StaticTest("Sam");
//        System.out.println(static1.getName()+" has increased by"+StaticTest.getNumInstance());
//
//        StaticTest static2=new StaticTest("Sara");
//        System.out.println(static2.getName()+" has increasedby"+StaticTest.getNumInstance());
//
            int answer = multiply(45);
        System.out.println("The number multiplied is "+ answer);
    }

    public static int multiply(int x){
        return x * multiplier;
    }
}
