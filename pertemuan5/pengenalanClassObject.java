package com.pertemuan5;
class main {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}
public class pengenalanClassObject {
    public static void main (String[] args) throws Exception{
        main pengenalan1= new main();
        pengenalan1.nama="patuyy";
        pengenalan1.NIM="1111111";
        pengenalan1.jurusan="Informatika";
        pengenalan1.IPK=4.0;
        pengenalan1.umur=20;
        System.out.println(pengenalan1.nama);
        System.out.println(pengenalan1.NIM);
        System.out.println(pengenalan1.jurusan);
        System.out.println(pengenalan1.IPK);
        System.out.println(pengenalan1.umur);
        System.out.print("\n");
        main pengenalan2= new main();
        pengenalan2.nama="jaja";
        pengenalan2.NIM="2222222";
        pengenalan2.jurusan="Sistem Informasi";
        pengenalan2.IPK=3.5;
        pengenalan2.umur=20;
        System.out.println(pengenalan2.nama);
        System.out.println(pengenalan2.NIM);
        System.out.println(pengenalan2.jurusan);
        System.out.println(pengenalan2.IPK);
        System.out.println(pengenalan2.umur);
    }
}


