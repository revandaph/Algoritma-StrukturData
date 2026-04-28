package Jobsheet10Queue.TugasLayananAkademik21;

import java.util.Scanner;

public class MainKRS21 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS21 antrian = new AntrianKRS21(10, 30);

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("   ANTRIAN PERSETUJUAN KRS - DPA        ");
            System.out.println("========================================");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Proses KRS (panggil 2 mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Jumlah Antrian Saat Ini");
            System.out.println("7.  Jumlah Mahasiswa Sudah KRS");
            System.out.println("8.  Jumlah Mahasiswa Belum KRS");
            System.out.println("9.  Kosongkan Antrian");
            System.out.println("10. Cek Antrian Kosong");
            System.out.println("11. Cek Antrian Penuh");
            System.out.println("0.  Keluar");
            System.out.println("----------------------------------------");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS21 mhs = new MahasiswaKRS21(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakSudahKRS();
                    break;
                case 8:
                    antrian.cetakBelumKRS();
                    break;
                case 9:
                    antrian.kosongkanAntrian();
                    break;
                case 10:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 11:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh!");
                    } else {
                        System.out.println("Antrian belum penuh. Sisa slot: " + (10 - antrian.size));
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
