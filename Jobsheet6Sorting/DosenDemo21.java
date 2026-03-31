package Jobsheet6Sorting;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen21 list = new DataDosen21();

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda)");
            System.out.println("4. Sorting DESC (Usia tertua)");
            System.out.println("5. Insertion Sort ASC");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode  : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen21 d = new Dosen21(kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    list.insertionSort();
                    list.tampil();
                    break;
            }

        } while (pilih != 0);
    }
}