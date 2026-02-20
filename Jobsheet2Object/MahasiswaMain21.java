package Jobsheet2Object;

public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        System.out.println(mhs1.nilaiKinerja());
    }
}

/* Pertanyaan Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses
instansiasi! Apa nama object yang dihasilkan?
    Mahasiswa21 mhs1 = new Mahasiswa21();
    nama object yang dihasilkan yaitu mhs1.

2. Bagaimana cara mengakses atribut dan method dari suatu objek? caranya dengan memberi titik (.),
    antara nama object (mhs1) dan nama atribut (nama), jadinya mhs1.nama misal akan memanggil nama
    Ali, maka nanti di ketik mhs1.nama = Ali, jadinya mengambil object nama, dimasukkan di atribut
    nama lalu di isikan dengan Ali.

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda? karena 
    perubahan data yang di dalam object yan berubah dimana awalnya 3.9 menjadi 3.55
    Mahasiswa21 menjadi blueprint yang mana terdapat object yang bisa mengisikan data baru
    pada atribut. Makannya outputnya menjadi beda.
*/
