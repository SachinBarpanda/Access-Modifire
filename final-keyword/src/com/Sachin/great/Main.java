package com.Sachin.great;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//        /**
//         * Does not work as math is final and private
//         * */
//
//        //Math m =new Math();
//
//        int pw = 7475945;
//        Password pass = new Password(pw);
//        pass.storePassword();
//
//        pass.letmeIn(283948);
//        pass.letmeIn(9384798);
//        pass.letmeIn(7475945);

        StaticInitialize staticClass = new StaticInitialize();
        staticClass.someMethod();

        System.out.println("Owner is " + staticClass.owner);
    }
}
