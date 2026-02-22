package Jobsheet2Object;

public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 matkul1 = new MataKuliah21();
        matkul1.kodeMK = "DS102";
        matkul1.nama = "Teori Algoritma dan Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(2);
        matkul1.tampilInformasi();

        matkul1.ubahSKS(1);
        matkul1.kurangiJam(4);
        matkul1. tampilInformasi();

        MataKuliah21 matkul2 = new MataKuliah21("AP201", "Praktikum Algoritma dan Struktur Data", 2, 4);
        matkul2.tampilInformasi();

        matkul2.ubahSKS(1);
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();
    }
}
