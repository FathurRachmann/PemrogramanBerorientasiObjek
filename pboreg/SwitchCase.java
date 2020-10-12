package com.pboreg;

import  java.util.*;

public class SwitchCase {
    public static void main(String[] args) {

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Nama : ");
        input = inputUser.next();

        //ekspresinya berupa satuan int,long,byte,short, string

        switch (input) {
            case "otong":
                System.out.println("Saya Budi Hader bos!!");
                break;
            case "ucup":
                System.out.println("Saya Hendra Hader bos!!");
                break;
            case "mario":
                System.out.println("Saya Mandra Hader bos!!");
                break;
            default:
                System.out.println(input + " Ga Hader bos!!");
        }
        System.out.println("Selesai");
    }
}
