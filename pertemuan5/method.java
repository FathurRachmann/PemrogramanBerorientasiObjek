package com.pertemuan5;
class main0{
    String nama;
    String NIM;
    main0(String nama, String NIM){
        this.nama=nama;
        this.NIM=NIM;
    }
    void show(){
        System.out.println("Nama : "+this.nama);
        System.out.println("NIM : "+this.NIM);
    }
    void setNama(String nama){
        this.nama=nama;
    }
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    String sayHi(String message){
        return message+" juga, nama saya adalah "+this.nama;
    }
}
public class method {
    public static void main(String[]args){
        main0 method= new main0("patuyy","54786165165");
        method.show();
        method.setNama("patuyy");
        method.show();
        System.out.println(method.getNama());
        System.out.println(method.getNIM());
        String data = method.sayHi("tampan dan berani");
        System.out.println(data);
    }
}
