package com.pboreg;

public class OperatorKomparasi {
    public static void main(String[] args) {
        // write your code here
        // Operator komparasi...ini akan menghasilkan nilai dalam bentuk boolean

        int a, b ;
        boolean HasilKomparasi ;

        // Operator equal atau persamaan
        System.out.println ("=====Persamaan") ;

        a = 10 ;
        b = 10 ;

        HasilKomparasi = (a == b) ;

        System.out.printf ("%d == %d --> %s \n", a, b, HasilKomparasi) ;

        a = 12 ;
        b = 10 ;

        HasilKomparasi = (a == b) ;

        System.out.printf ("%d == %d --> %s \n", a, b, HasilKomparasi) ;

        // Operator not equal atau pertidaksamaan
        System.out.println ("=====Pertidaksamaan") ;

        a = 10 ;
        b = 10 ;

        HasilKomparasi = (a != b);

        System.out.printf ("%d == %d --> %s \n", a, b, HasilKomparasi) ;

    }
}
