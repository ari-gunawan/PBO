package com.pbo_p2;

public class Main {

    public static void main(String[] args) {

        classKu  obil = new classKu();
        System.out.println("Nilai A = "  + obil.tampilkanA());
        System.out.println("Nilai B = "  + obil.tampilkanB());
        System.out.println("Nilai C = "  + obil.tampilkanC());

        //nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setalah diinput = " + obil.tampilkanA());
        //nilai B diinput
        obil.inputB(200);
        System.out.println("Nilai B setalah diinput = " + obil.tampilkanB());
        //nilai C diinput
        obil.inputC(300);
        System.out.println("Nilai C setalah diinput = " + obil.tampilkanC());

        //panggil method jumlh()
        System.out.println("Hasil penjumlahan A, B, dan C adalah = " + obil.jumlh());
        //panggil method kurng()
        System.out.println("Hasil pengurangan A, B, dan C adalah = " + obil.kurng());
        //panggil method kali()
        System.out.println("Hasil pengkalian A, B, dan C adalah = " + obil.kali());
        //panggil method bagi()
        System.out.println("Hasil pengbangian B dengan A adalah = " + obil.bagi());
    }
}