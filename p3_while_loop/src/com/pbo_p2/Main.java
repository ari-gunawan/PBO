package com.pbo_p2;

public class Main {

    public static void main(String[] args) {
        //While Loop
        int a = 0;
        boolean kondisi =  true;
        System.out.println("awal program");
        while (kondisi) {
            System.out.println("while loop ke-" +a);
            a++;
            if (a == 10){
                kondisi = false;
            }
        }
        System.out.println("akhir program");
    }
}
