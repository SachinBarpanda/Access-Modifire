package com.great.sachin;

public class StaticTest {
    public static int numInstance;//previosly not static
    private String name;

    public StaticTest(String name){
        this.name= name;
        numInstance++;
    }
    public static int getNumInstance(){
        return numInstance;
    }
    public String getName(){
        return name;
    }
}
