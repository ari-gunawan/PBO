package com.pbo_p2;

interface TugasMahasiswa{
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}
class Mahasiswa implements TugasMahasiswa{
    public Mahasiswa(){
        System.out.println("Tugas mahasiswa adalah :");
    }

    @Override
    public void Kuliah() {
        System.out.println("1. Kuliah tepat waktu");
    }

    @Override
    public void BelajarMandiri() {
        System.out.println("2. Balajar mandiri, rajin membaca");
    }

    @Override
    public void MengembangkanDiri() {
        System.out.println("3. Mengembangkan diri melalui pelatihan dan komunitas");
    }
}
public class Main {

    public static void main(String[] args) {
        Mahasiswa Ari = new Mahasiswa();

        Ari.Kuliah();
        Ari.BelajarMandiri();
        Ari.MengembangkanDiri();
    }
}
