package Jobsheet2Object;

public class LatihanMahasiswa21 {

    String nama, nim, kelas;
    Double ipk;

    public LatihanMahasiswa21() {

    }

    public LatihanMahasiswa21(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk=ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(Double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        LatihanMahasiswa21 mhs = new LatihanMahasiswa21();
        mhs.nama = "Revalinda";
        mhs.nim = "254107060053";
        mhs.kelas = "SIB-1E";
        mhs.updateIPK(3.9);

        mhs.tampilkanInformasi();
        System.out.println(mhs.nilaiKinerja()); 
    } 
}