package com.pboreg;

import java.util.Scanner ;

public class PengelompokanOperasiAritmatika {
    public static void main (String [] args ) {
        // Kesimpulannya adalah perkalian atau pembagian akan dilakukan terlebih dahulu
        // Jika dilakukan perkalian dan pembagian, maka akan dilakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // Menggunakan pengelompokan operasi dengan (  )
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // Perhitungan persamaan kuadrat

        int m, x, c;

        System.out.print("Nilai x = ");
    }
}