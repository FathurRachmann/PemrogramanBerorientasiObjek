package com.pboreg;

public class OperasiAritmatika {
    public static void main(String[] args) {
        // write your code here
        //operasi aritmatika
        int variable1 = 5;
        int variable2 = 6;

        int hasil;

        //penjumlahan
        hasil = variable1 + variable2;
        System.out.println( variable1 + " + " + variable2 + " = " + hasil);

        //pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n", variable1, variable2, hasil);

        //perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n", variable1, variable2, hasil);

        //pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        //modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n", variable1, variable2, hasil);
    }
}
