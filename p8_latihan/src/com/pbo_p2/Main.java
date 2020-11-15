package com.pbo_p2;

interface Luas{
    public void setSisi(double...sisi);
    public double getLuas();
}
class LuasSegitiga implements Luas{
    private double alas;
    private double tinggi;

    @Override
    public void setSisi(double... sisi){
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }
    @Override
    public double getLuas(){
        double luas = 0.5 * this.alas * this.tinggi;
        return  luas;
    }

    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }
}
public class Main {

    public static void main(String[] args) {
    LuasSegitiga hasil = new LuasSegitiga();
    hasil.setSisi(10,10);
        System.out.println("luas segitiga = " + hasil.getLuas());
    }
}