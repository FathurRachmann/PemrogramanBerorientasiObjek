package com.pboreg;

import java.util.Scanner;

public class MengambilInputSCANER {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas;
        //membuat perhitungan menghitung luas persegi panjang
        //luas = panjang * lebar

        System.out.println("Menghitung Luas");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);



    }
}
