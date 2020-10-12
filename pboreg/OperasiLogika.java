package com.pboreg;

import java.util.*;

public class OperasiLogika {
    public static void main(String[] args) {
        // write your code here
        //membuat objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        //sebuah program sederhana untuk menebak sebuah anka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukan nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah " + nilaiTebakan);

        //operasilogika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda : " + statusTebakan);

        //operasi aljabar boolean (and / or)

        System.out.println("tebakan anda : " + statusTebakan);
    }
}
