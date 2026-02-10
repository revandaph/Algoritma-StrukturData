package Jobsheet1KonsepDaspro;

import java.util.Scanner;

public class TugasPraktikumJadwalKuliah {
    public static void main(String[] args) {
        Scanner reva = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int jumlahJadwal = reva.nextInt();
        reva.nextLine();

        String[][] jadwalKuliah = new String[jumlahJadwal][4];

        for (int i = 0; i < jumlahJadwal; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwalKuliah[i][0] = reva.nextLine();

            System.out.print("Ruang            : ");
            jadwalKuliah[i][1] = reva.nextLine();

            System.out.print("Hari             : ");
            jadwalKuliah[i][2] = reva.nextLine();

            System.out.print("Jam              : ");
            jadwalKuliah[i][3] = reva.nextLine();
        }

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = reva.nextInt();
            reva.nextLine();

            switch (pilihan) {
                case 1:
                    tampilSemua(jadwalKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan Hari : ");
                    String hari = reva.nextLine();
                    cariHari(jadwalKuliah,hari);
                    break;
                case 3:
                    System.out.print("Masukkan Mata Kuliah : ");
                    String mataKuliah = reva.nextLine();
                    cariMatkul(jadwalKuliah, mataKuliah);
                    break;
            }

        } while (pilihan != 4);
        reva.close();
    }

    static void tampilSemua(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println((i+1) + ". " + jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][2] + " | " + jadwal[i][3]);
        }
    }

    static void cariHari(String[][] jadwal, String hari) {
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][2] + " | " + jadwal[i][3]);
            }
        }
    }

    static void cariMatkul(String[][] jadwal, String matkul) {
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][2] + " | " + jadwal[i][3]);
            }
        }
    }
}