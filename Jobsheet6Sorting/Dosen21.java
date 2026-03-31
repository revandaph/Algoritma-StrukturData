package Jobsheet6Sorting;

public class Dosen21 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen21(String kd, String nm, boolean jk, int usia) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
    }
}