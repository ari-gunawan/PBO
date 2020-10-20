package com.pbo_p2;

public class classKu {
    //Attribute
    public int a = 10; //atribut ini tidak boleh diakses secara langsung dari luar classKU
    public int b = 20;
    public int c = 30;

    public int tampilkanA(){
        return this.a;
    }
    public int tampilkanB(){
        return this.b;
    }
    public int tampilkanC(){
        return this.c;
    }

    public void inputA(int nilai){
        this.a = nilai;
    }
    public void inputB(int nilai){
        this.b = nilai;
    }
    public void inputC(int nilai){
        this.c = nilai;
    }

    public int jumlh(){
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    public int kurng(){
        int hasil = this.a - this.b - this.c;
        return hasil;
    }
    public int kali(){
        int hasil = this.a * this.b * this.c;
        return hasil;
    }
    public double bagi(){
        double hasil = (double) this.a / (double) this.b;
        return hasil;
    }
}


