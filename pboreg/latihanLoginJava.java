package com.pboreg;
import java.util.Scanner;

public class latihanLoginJava {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String user, pass;

        System.out.print("Username : ");
        user = input.nextLine();

        System.out.print("password : ");
        pass = input.nextLine();

        if (user.equals("fathur") && (pass.equals("asdf"))) {
            System.out.println("Selamat datang ");
        }else{
            System.out.println("Username atau password salah");
        }
    }
}
