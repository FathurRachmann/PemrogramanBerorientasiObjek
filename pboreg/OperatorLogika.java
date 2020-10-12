package com.pboreg;

public class OperatorLogika {
    public static void main(String[] args) {
        // write your code here
        //operator logika
        //AND, OR, XOR, Negasi

        boolean a,b,c;
        //OR / atau (||)
        System.out.println("==== OR (||) ====");
        a= false;
        b= false;
        c= (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a= false;
        b= true;
        c= (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a= true;
        b= false;
        c= (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a= true;
        b= true;
        c= (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //AND / dan (&&)
        System.out.println("==== AND (&&) ====");
        a= false;
        b= false;
        c= (a&&b);
        System.out.println(a + " && " + b + " = " + c);
    }
}
