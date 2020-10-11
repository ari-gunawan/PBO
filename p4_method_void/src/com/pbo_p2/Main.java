package com.pbo_p2;

public class Main {

    public static void main(String[] args) {
	// void artinya hampa

        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }

    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    //method dengan kembalian
    //sehingga menggunakan return untuk
    //mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}
