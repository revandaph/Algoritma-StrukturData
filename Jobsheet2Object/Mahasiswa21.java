package Jobsheet2Object;

public class Mahasiswa21 {

    String nama, nim, kelas;
    Double ipk;

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
        Mahasiswa21 mhs = new Mahasiswa21();
        mhs.nama = "Revalinda";
        mhs.nim = "254107060053";
        mhs.kelas = "SIB-1E";
        mhs.updateIPK(3.9);

        mhs.tampilkanInformasi();
        System.out.println(mhs.nilaiKinerja());
    }
}

/* Pertanyaan Percobaan 1: Deklarasi Class, Atribut dan Method

1. Sebutkan dua karakteristik class atau object!
    Memiliki identitas (identity), setiap object bisa dibedakan satu sama lain.
    Memiliki atribut dan method, sebagai penyimpan data dan aksi.

2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Mahasiswa? Sebutkan apa saja atributnya! Ada 4 yaitu, nama,nim,kelas,dan ipk.

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! Ada 4 method, yaitu:
tampilkanInformasi(), ubahKelas(String kelasBaru), updateIPK(Double ipkBaru), nilaiKinerja().

4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method
tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak
pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
    Untuk mengechek kriteria ipk nya. Kriteria yang digunakan yaitu, jika IPK ≥ 3.5 maka outputnya "Kinerja sangat baik",
    jika IPK ≥ 3.0 outputnya "Kinerja Baik", IPK ≥ 2.0 outputnya "Kinerja cukup", selain itu maka outputnya "Kinerja kurang".
    Yang direturn kan adalah kategori Mahasiswa dengan tipe data String.

6. Commit dan push kode program ke Github. Done

*/