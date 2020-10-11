package com.pbo_p2;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner unserInput = new Scanner(System.in);
        while (true) {
            System.out.println("panjang= ");
            int inputPanjang = unserInput.nextInt();
            System.out.println("lebar= ");
            int inputLebar = unserInput.nextInt();
            gambar(inputPanjang,inputLebar);
        }
     }

    public static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.printf("+ ");
            }
            System.out.printf("\n");
        }
    }
}
