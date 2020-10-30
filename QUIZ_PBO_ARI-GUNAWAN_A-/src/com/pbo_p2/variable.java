package com.pbo_p2;

public class variable {

        public int a,b,c;

        public void setA (int a){
            this.a = a;
        }

        public void setB (int b){
            this.b = b;
        }

        public void setC (int c){
            this.c = c;
        }

        public int hasilPenjumlahan;

        public void hitung() {
            System.out.println("SOAL NO 1\n");
            hasilPenjumlahan = this.a + this.b + this.c;
            System.out.println("Hasil penjumlahan A, B, dan C adalah : \n" + hasilPenjumlahan);
            System.out.println("\n");
        }
        public float rataRata;

        public void hitung1() {
            System.out.println("SOAL NO 2\n");
            float hasilPenjumlahan = this.a + this.b + this.c;
            System.out.println("Hasil penjumlahan A, B, dan C adalah : \n" + hasilPenjumlahan);
            rataRata = hasilPenjumlahan / 3;
            System.out.println("Hasil nilai rata dari A, B, dan , C adalah : \n" + rataRata);
            System.out.println("\n");
        }
        public void hitung2() {
            double max = -9999;
            if (this.a > max){
                max = this.a;
            }if (this.b > max){
                max = this.b;
            }if (this.c > max){
                max = this.c;
            }
            System.out.println("Nilai maximum adalah : " + max);
            double min = 99999;
            if (this.a < min){
                min = this.a;
            }if (this.b < min){
                min = this.b;
            }if (this.c < min){
                min = this.c;
            }
            System.out.println("Nilai maximum adalah : " + min);
        }


}
