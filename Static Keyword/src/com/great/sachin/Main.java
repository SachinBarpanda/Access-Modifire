package com.great.sachin;

public class Main {
    public static void main(String[] args) {

        StaticTest static1=new StaticTest("Sam");
        System.out.println(static1.getName()+"has increased by"+static1.getNumInstance());

        StaticTest static2=new StaticTest("Sara");
        System.out.println(static2.getName()+"has increasedby"+static2.getNumInstance());
    }
}
