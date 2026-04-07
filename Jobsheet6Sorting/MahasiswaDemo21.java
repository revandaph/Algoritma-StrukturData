package Jobsheet6Sorting;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            String ipkStr = sc.nextLine();
            double ipk = Double.parseDouble(ipkStr);

            System.out.println("-----------------------------------");

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        //Jobsheet 7 Searching
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String cariStr = sc.nextLine();
        double cari = Double.parseDouble(cariStr);

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData setelah sorting berdasarkan IPK (DESC): ");
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();
    }
}