package com.pbo_p2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Buatlah program dengan konsep OOP, untuk menginput 3 buah
        // nilai dari keyboard. Lalu hasilnya dikumlah dan ditampilkan ke layar monitor
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);

        variable ob = new variable();
        int a;
        int b;
        int c;
        System.out.println("Masukkan Nilai A : ");
        a =in.nextInt();
        System.out.println("Masukkan Nilai B : ");
        b = in2.nextInt();
        System.out.println("Masukkan Nilai C : ");
        c = in3.nextInt();
        ob.setA(a);
        ob.setB(b);
        ob.setC(c);


        // no.1
        ob.hitung();

        // no.2
        ob.hitung1();

        //no.3
         ob.hitung2();

         // no.4
        soalEmpat ob4 = new soalEmpat();
        Scanner in4 = new Scanner(System.in);
        Scanner in5 = new Scanner(System.in);
        Scanner in6 = new Scanner(System.in);
        Scanner in7 = new Scanner(System.in);
        Scanner in8 = new Scanner(System.in);
        Scanner in9 = new Scanner(System.in);
        Scanner in10 = new Scanner(System.in);
        int internet,ketik,gameOnline;
        int scan,warna,hitamPutih,tehBotol;
        System.out.println("~~~WARNET CONNECT~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan waktu pemakaian");
        System.out.println("Internet           : ");
        internet = in4.nextInt();
        System.out.println("Mengetik           : ");
        ketik = in5.nextInt();
        System.out.println("Game online        : ");
        gameOnline = in6.nextInt();
        ob4.setInternet(internet);
        ob4.setKetik(ketik);
        ob4.setGameOnline(gameOnline);

        System.out.println("Tambahan fasilitas");
        System.out.println("Scan file          : ");
        scan = in7.nextInt();
        System.out.println("print= warna       : ");
        warna = in8.nextInt();
        System.out.println("print= hitam putih : ");
        hitamPutih = in9.nextInt();
        System.out.println("teh botol          : ");
        tehBotol = in10.nextInt();
        ob4.setScan(scan);
        ob4.setWarna(warna);
        ob4.setHitamPutih(hitamPutih);
        ob4.setTehBotol(tehBotol);

        ob4.biaya();
    }
}
