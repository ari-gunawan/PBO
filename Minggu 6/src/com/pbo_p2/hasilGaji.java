package com.pbo_p2;

public class hasilGaji extends dataDiri {
    private int jamKerja;
    private int golongan;

    private void setJamKerja (int jamKerja){
        this.jamKerja = jamKerja;
    }

    private int getJamKerja(){
        return jamKerja = 0;
    }

    private  void setGolongan(int golongan){
        this.golongan = golongan;
    }

    private int getGolongan(){
        return golongan = 0;
    }

    private int gaji;

    private void int getGaji(int gaji){
        this.gaji = gaji;
        return gaji;
    }

    private int getGaji(){
        return gaji;
    }

    public void gaji(){
        int gajiPokok = 0;
        int tunjangan = 0;
        int lembur;
        int gajiLembur;
        double total;
        int jamKerja = 0;

        if (golongan == 1) {
            gajiPokok = 1486500;
            tunjangan = 300000;
        }
        if (golongan == 2) {
            gajiPokok = 1926000;
            tunjangan = 300000;
        }
        if (golongan == 3) {
            gajiPokok = 2456700;
            tunjangan = 350000;
        }
        if (golongan == 4) {
            gajiPokok = 2899500;
            tunjangan = 400000;
        }else{
            System.out.println("GOLONGAN YANG ANDA MASUKKAN SALAH");
        }

        if (jamKerja <= 172){
            lembur = 0;
        }else{
            lembur = jamKerja - 173;
        }

        gajiLembur = lembur * 20000;
        total = (gajiPokok + tunjangan + gajiLembur) * 0.5;
        System.out.println("\tGaji Pokok Anda  = Rp.  " + gajiPokok);
        System.out.println("\tTunjangan Anda   = Rp.  " + tunjangan);
        System.out.println("\tGaji Lembur Anda = Rp.  " + gajiLembur);
        System.out.println("=====================================");
        System.out.println("Total Gaji Anda adalah = RP.   " + total);
        System.out.println("=====================================");
    }
}
