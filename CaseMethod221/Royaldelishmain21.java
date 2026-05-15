package CaseMethod221;

import java.util.Scanner;

// Kelas utama program Sistem Antrian Royal Delish
// Mengintegrasikan antrian pembeli (DLL FIFO) dan pencatatan pesanan
public class Royaldelishmain21 {

    static AntrianDLL21 antrian = new AntrianDLL21();
    static PesananDLL21 pesanan = new PesananDLL21();
    static Scanner      sc      = new Scanner(System.in);

    public static void main(String[] args) {

        // Isi antrian awal dengan data dummy
        antrian.tambahAntrian("Nabila", "08224500000");
        antrian.tambahAntrian("Bilqis", "08224511111");
        antrian.tambahAntrian("Naufal", "08224522222");
        antrian.tambahAntrian("Zaidan", "08422234556");

        // Loop menu utama: tampilkan menu → baca pilihan → jalankan aksi
        // Berhenti jika pengguna memilih 0
        int pilih;
        do {
            tampilMenu();
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1: tambahAntrian();    break;
                case 2: antrian.cetakAntrian(); break;
                case 3: hapusDanPesan();    break;
                case 4: pesanan.cetakLaporan(); break;
                case 0: System.out.println("Terima kasih telah menggunakan Sistem Antrian Royal Delish!"); break;
                default: System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }

    static void tampilMenu() {
        System.out.println("\n==============================");
        System.out.println("  SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
    }

    // Baca input nama dan HP, lalu enqueue ke antrian
    static void tambahAntrian() {
        System.out.print("Nama Pembeli : ");
        String nama = sc.nextLine();
        System.out.print("No HP        : ");
        String hp   = sc.nextLine();
        antrian.tambahAntrian(nama, hp);
    }

    // Dequeue pembeli dari head antrian (FIFO), baca detail pesanan,
    // buat node pesanan, lalu tambahkan ke daftar pesanan
    static void hapusDanPesan() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pembeli21 pembeli = antrian.hapusAntrian(); // Ambil pembeli terdepan
        System.out.println("Melayani : " + pembeli.namaPembeli);

        System.out.print("Kode Pesanan  : ");
        int kode    = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama Pesanan  : ");
        String nama = sc.nextLine();
        System.out.print("Harga         : ");
        int harga   = sc.nextInt();
        sc.nextLine();

        Pesanan21 pesan = new Pesanan21(kode, nama, harga, pembeli.namaPembeli);
        pesanan.tambahPesanan(pesan); // Catat pesanan ke daftar pesanan
        System.out.println(pembeli.namaPembeli + " telah memesan " + nama);
    }
}
