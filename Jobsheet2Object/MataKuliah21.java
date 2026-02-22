package Jobsheet2Object;

public class MataKuliah21 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah21() {

    }

    public MataKuliah21(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("\nKode Mata Kuliah : " + kodeMK);
        System.out.println("Nama             : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;  
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }

    public static void main(String[] args) {
        MataKuliah21 matkul = new MataKuliah21();
        matkul.kodeMK = "AD201";
        matkul.nama = "Algoritma dan Struktur Data";
        matkul.sks = 2;
        matkul.jumlahJam = 4;

        matkul.tampilInformasi();
    }
}
