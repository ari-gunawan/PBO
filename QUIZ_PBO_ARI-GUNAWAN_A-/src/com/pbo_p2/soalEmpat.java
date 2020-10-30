package com.pbo_p2;

public class soalEmpat {

    public int internet,ketik,gameOnline;

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public void setKetik(int ketik) {
        this.ketik = ketik;
    }

    public void setGameOnline(int gameOnline) {
        this.gameOnline = gameOnline;
    }
    public int scan,warna,hitamPutih,tehBotol;

    public void setScan(int scan) {
        this.scan = scan;
    }

    public void setWarna(int warna) {
        this.warna = warna;
    }

    public void setHitamPutih(int hitamPutih) {
        this.hitamPutih = hitamPutih;
    }

    public void setTehBotol(int tehBotol) {
        this.tehBotol = tehBotol;
    }

    public void biaya(){
        double jumlahInternet = (double) this.internet/ 60 * 4000;
        double jumlahKetik = (double) this.ketik/60 * 2000;
        double jumlahGameOnline = (double) this.internet /60 * 5000;
        System.out.println("Biaya internet    : Rp. " + jumlahInternet);
        System.out.println("Biaya mengetik    : Rp. " + jumlahKetik);
        System.out.println("Biaya game online : Rp. " + jumlahGameOnline);

        double jumlahScan = (double) this.scan * 1000;
        double jumlahWarna = (double) this.warna * 500;
        double jumlahHitamPutih = (double) this.hitamPutih * 300;
        double jumlahTehBotol = (double) this.tehBotol * 3000;
        System.out.println("Biaya scan                : Rp. " + jumlahScan);
        System.out.println("Biaya print (warna)       : Rp. " + jumlahWarna);
        System.out.println("Biaya print (hitam-putih) : Rp. " + jumlahHitamPutih);
        System.out.println("Biaya teh botol           : Rp. " + jumlahTehBotol);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        double jumlahTotal = jumlahInternet + jumlahKetik + jumlahGameOnline + jumlahScan + jumlahWarna + jumlahHitamPutih + jumlahTehBotol;
        System.out.println("Total biaya yang harus dibayar : Rp. " + jumlahTotal);
    }
}
