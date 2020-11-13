package com.pboreg.pertemuan9;
interface  Luas{
    public void setSisi(double...sisi);
    public  double getluas();
}
class LuasSegitiga implements Luas {
    private double alas;
    private double tinggi;

    @Override
    public void setSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }

    @Override
    public double getluas() {
        double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }

    public double getAlas() {
        return alas;
    }

    public void getTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
public class RunLuas3 {
    public static void main(String[] args) {
        LuasSegitiga ls = new LuasSegitiga();
        ls.setSisi(5, 10);
        System.out.println("Luas segitiga = 0.5 x " +
                ls.getAlas() + "x" +
                ls.getTinggi() + "=" + ls.getluas());
    }
}