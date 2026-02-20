package Jobsheet2Object;

public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();
    
        Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "2141720106", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa21 mhsRevalinda = new Mahasiswa21("Revalinda Putri", "254107060053", 3.63, "SIB-1E");
        mhsRevalinda.tampilkanInformasi();
        System.out.println(mhsRevalinda.nilaiKinerja());
    }
}

/* Pertanyaan Percobaan 3: Membuat Konstruktor

1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!
        public Mahasiswa21(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut? Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "2141720106", 3.25, "TI 2L");
    untuk membuat object baru bernama mhs2 menggunakan konstruktor berparameter, disini mengisikan nilai:
    nama = "Annisa Nabila"
    nim = "2141720106"
    ipk = 3.25
    kelas = "TI 2L"
    jadi nantinya akan langsung menginisialisasi data saat object dibuat.

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
    Hasilnya akan error, karena java ngga menemukan konstruktor tanpa parameter lagi, pada java
    jika kita membut konstruktor berparameter , java tidak otomatis membuat konstruktor kosong,
    jadinya program ngga bisa di compile.

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!
    Tidak harus, karena method dipanggil sesuai kebutuhan saja, bukan untuk urutan tertentu.
    Selama object sudah dibuat, method bisa dipanggil kapan saja.

5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
    Done.

6. Commit dan push kode program ke Github. Done

*/
