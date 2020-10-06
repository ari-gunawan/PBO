package com.pbo_p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 0;
        String id;
        String pass;
        Scanner inputUser= new Scanner(System.in);
        System.out.println("Hallo, silahkan masukkan ID dan PASSWORD\n");

        do{
            x++;
            System.out.print("ID: ");
            id =inputUser.next();
            System.out.print("PASSWORD: ");
            pass = inputUser.next();

            if (id.equals("ari") && pass.equals("gunawan")) {
                System.out.println("selamat datang");
                return;
            }else{
                System.out.println("ID ATAU PASSWORD YANG ANDA MASUKKAN SALAH INI PERCOBAAN KE- " + x + "/3");
            }

        } while (x<3);
        System.out.println("MAAF GAGAL, COBA DIKESEMPATAN LAIN");


    }
}
