package com.pbo_p2;

abstract class Hewan {
    public abstract void SuaraHewan();

    public void Tidur() {
        System.out.println("Zzz");
    }
}

class Ayam extends Hewan {
    public void SuaraHewan() {
        System.out.println("Kukuruyuk");
    }
}

class Kucing extends Hewan{
    public void SuaraHewan() {
        System.out.println("Meong");
    }
}

public class Main {

    public static void main(String[] args) {
        Ayam ayamku = new Ayam();
        ayamku.SuaraHewan();
        ayamku.Tidur();
        Kucing kucingku = new Kucing();
        kucingku.SuaraHewan();
        kucingku.Tidur();
    }
}
