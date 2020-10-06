package com.pbo_p2;

public class Main {

    public static void main(String[] args) {
        // For Loop
        System.out.println("ini adalah awal program");
        System.out.println("loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++) {

            System.out.println("nilai ke- " + nilai);
        }

        System.out.println("loop kedua");
        for (int nilai = 0; nilai < 10; nilai++) {

            System.out.println("nilai ke- " + nilai);
        }

        System.out.println("loop ketiga");
        for (int nilai = 10; nilai >= 0; nilai--) {

            System.out.println("nilai ke- " + nilai);
        }

        System.out.println("loop keempat");
        int nilai =0;
        for (; nilai <= 10; nilai++) {

            System.out.println("nilai ke- " + nilai);
        }
        System.out.println("ini akhir program");
    }
}
