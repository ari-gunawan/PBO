package com.pbo_p2;

public class dataDiri {
    private long nip;
    private String nama;
    private int umur;
    private String jabatan;

    public void setNIP (long nip){
        this.nip = nip;
    }

    public long getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

}
