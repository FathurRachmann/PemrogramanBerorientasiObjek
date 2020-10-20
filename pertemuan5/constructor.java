package com.pertemuan5;
class main1 {
    String nama;
    String NIM;
    String jurusan;
    main1(String inputNama, String inputNIM,String inputjurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputjurusan;
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class constructor {
    public static void main (String[] args) throws Exception{
        main1 constructor1 = new main1("dadan","484651354","arsitektur");
        main1 constructor2 = new main1("dean", "546513245","desain komunikasi visual");
    }

}

