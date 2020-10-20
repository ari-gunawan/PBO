package com.pbo_p2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Program obil = new Program();

        System.out.println("ISI DATA DIRI KALIAN");
        obil.qNama();
        obil.nama = in.next();

        obil.qNIM();
        obil.nim = in.nextInt();

        obil.qJenis();
        obil.jenis = in.next();

        obil.qProdi();
        obil.prodi = in.next();

        obil.qAngkatan();
        obil.angkatan = in.nextInt();

        System.out.println("\n INI MERUPAKAN DATA ANDA SEBAGAI MAHASISWA " + obil.prodi +" ANGKATAN " + obil.angkatan);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Nama            : " + obil.nama);
        System.out.println("NIM             : " + obil.nim);
        System.out.println("Jenis kelamin   : " + obil.jenis);
        System.out.println("PRODI           : " + obil.prodi);
        System.out.println("Angkatan        : " + obil.angkatan);

        System.out.print("~~~TERIMA KASIH~~~");
    }
}
