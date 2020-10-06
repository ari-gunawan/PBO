package com.pbo_p2;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	//Latihan Loop
    //Program untuk menjumlahkan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.printf("masukkan nilai awal= ");
        nilaiAwal = inputUser.nextInt();
        System.out.printf("Masukkan nilai akhir= ");
        nilaiAkhir = inputUser.nextInt();


        total = 0;
        while (nilaiAwal <=  nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

    }
}
