package Jobsheet3ArrayObject;

import java.util.Scanner;

public class DataDosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        DataDosen21[] daftarDosen = new DataDosen21[jumlah];

        for (int i = 0; i < jumlah; i++) {
            daftarDosen[i] = new DataDosen21();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            daftarDosen[i].tambahData();
        }

        System.out.println("=== Data Semua Dosen ===");
        for (DataDosen21 d : daftarDosen) {
            d.cetakInfo();
        }

        int pria = 0, wanita = 0;
        int totalPria = 0, totalWanita = 0;
        DataDosen21 tertua = daftarDosen[0], termuda = daftarDosen[0];

        for (DataDosen21 d : daftarDosen) {
            if (d.jenisKelamin) {
                pria++;
                totalPria += d.usia;
            } else {
                wanita++;
                totalWanita += d.usia;
            }

            if (d.usia > tertua.usia) tertua = d;
            if (d.usia < termuda.usia) termuda = d;
        }

        System.out.println("Jumlah Dosen Laki-laki: " + pria);
        System.out.println("Jumlah Dosen Perempuan: " + wanita);
        System.out.println("Rata-rata Usia Laki-laki: " + (pria > 0 ? (double) totalPria/pria : 0));
        System.out.println("Rata-rata Usia Perempuan: " + (wanita > 0 ? (double) totalWanita/wanita : 0));
        System.out.println("=== Dosen Paling Tua ===");
        tertua.cetakInfo();
        System.out.println("=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
}
