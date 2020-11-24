package com.pbo_p2;

import java.util.Scanner;

class ContohArray2{
    private int [] angka;
    public ContohArray2(int jmlData){
        angka = new int[2];
    }
    public void viewAll(){
        System.out.println("view all for");
        for (int i = 0; i < this.angka.length; i++){
            System.out.println("Niali " + (i+1) + "= " +
                    this.angka[i]);
        }
    }
    public void setAngka(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input data");
        for (int i = 0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + "= ");
            this.angka[i] = sc.nextInt();
        }
    }
}
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah bilangan : ");
        int jmlBil = sc.nextInt();
        ContohArray2 arrA = new ContohArray2(jmlBil);
        arrA.setAngka();
        arrA.viewAll();
    }
}
