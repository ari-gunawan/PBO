package com.pbo_p2;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    Scanner in3 = new Scanner(System.in);
    Scanner in4 = new Scanner(System.in);
    Scanner in5 = new Scanner(System.in);
    Scanner in6 = new Scanner(System.in);

	long nip;
	String nama;
	int umur;
	String jabatan;
	int jamKerja;
	int golongan;

        dataDiri obil = new dataDiri();
        System.out.println("============================================================\n");
	    System.out.println("MASUKKAN DATA DIRI ANDA");
        System.out.println("============================================================\n");
	    System.out.println("NIP                     : ");
	    nip = in.nextLong();
	    System.out.print("NAMA                      : ");
	    nama = in2.nextLine();
        System.out.print("UMUR                      : ");
        umur = in3.nextInt();
	    System.out.print("JABATAN                   : ");
	    jabatan = in4.nextLine();
        System.out.print("JAM KERJA                 : ");
        jamKerja = in5.nextInt();
	    System.out.print("GOLONGAN KARYAWAN ANDA    : ");
        golongan = in6.nextInt();

        hasilGaji obil1 = new hasilGaji();
        obil1.getGaji(hasilGaji);
        /*System.out.println("============================================================\n");
        System.out.println("DATA DIRI ANDA");
        System.out.println("============================================================\n");
        System.out.println("NIP             : " + obil.getNip());
        System.out.println("NAMA            : " + obil.getNama());
        System.out.println("UMUR            : " + obil.getUmur());
        System.out.println("JABATAN         : " + obil.getJabatan());
        System.out.println("GOLONGAN ANDA   : " + golongan);
        System.out.println("============================================================\n");
        System.out.println("GAJI ANDA");
        System.out.println("============================================================\n");
        //System.out.printf("GAJI GOLONGAN %d                    : Rp." + golongan + " " + obil1. );
        //System.out.printf("TUNJANGAN                           : Rp." + " " + );
        System.out.printf("GAJI TOTAL (SETELAH PAJAK + LEMBUR) : Rp. " + obil1.getGaji());
*/
    }
}
