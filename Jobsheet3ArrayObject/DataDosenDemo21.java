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

        System.out.println("=== Daftar Dosen ===");
        for (DataDosen21 d : daftarDosen) {
            d.cetakInfo();
        }
    }
}
