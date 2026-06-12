package UASPrakt21;

import java.util.Scanner;

public class BukuMain21 {
    public static void main(String[] args) {

        BinarySearchTreeBuku21 bst = new BinarySearchTreeBuku21();
        Scanner sc = new Scanner(System.in);

        // Data awal
        bst.add(new Buku21("BK105", "Struktur Data",     "Andi",  2020));
        bst.add(new Buku21("BK102", "Algoritma Dasar",   "Budi",  2019));
        bst.add(new Buku21("BK108", "Basis Data",        "Citra", 2021));
        bst.add(new Buku21("BK101", "Pemrograman Java",  "Dewi",  2018));
        bst.add(new Buku21("BK104", "Sistem Operasi",    "Eka",   2022));
        bst.add(new Buku21("BK107", "Jaringan Komputer", "Fajar", 2017));

        // Input jumlah buku
        System.out.print("Masukkan jumlah buku yang ingin diinput: ");
        int jumlahInput = Integer.parseInt(sc.nextLine().trim());
        int antrianAwal = 6; // sudah ada 6 buku sebelumnya

        for (int i = 1; i <= jumlahInput; i++) {
            System.out.println("\n--- Input Buku ke-" + (antrianAwal + i) + " ---");

            System.out.print("Kode Buku     : ");
            String kode = sc.nextLine().trim();

            System.out.print("Judul         : ");
            String judul = sc.nextLine().trim();

            System.out.print("Penulis       : ");
            String penulis = sc.nextLine().trim();

            System.out.print("Tahun Terbit  : ");
            int tahun = Integer.parseInt(sc.nextLine().trim());

            bst.add(new Buku21(kode, judul, penulis, tahun));
        }

        sc.close();

        // 1. In-Order Traversal
        System.out.println("\n===============================");
        System.out.println("   DATA BUKU IN-ORDER (LNR)   ");
        System.out.println("===============================");
        bst.traverseInOrder(bst.getRoot());
        System.out.println("-------------------------------");

        // 2. Pre-Order Traversal
        System.out.println("\n===============================");
        System.out.println("  DATA BUKU PRE-ORDER (NLR)   ");
        System.out.println("===============================");
        bst.traversePreOrder(bst.getRoot());
        System.out.println("-------------------------------");

        // 3 & 4. Pencarian BK104 dan BK110
        System.out.println("\n===============================");
        System.out.println("          PENCARIAN            ");
        System.out.println("===============================");
        String[] kodeCari = {"BK104", "BK110"};
        for (String kode : kodeCari) {
            System.out.println("Pencarian " + kode + ": " +
                (bst.find(kode) ? "ditemukan" : "tidak ditemukan"));
        }

        // 5. Jumlah buku
        System.out.println("\n===============================");
        System.out.println("        JUMLAH BUKU            ");
        System.out.println("===============================");
        System.out.println("Jumlah buku: " + bst.hitungJumlahBuku(bst.getRoot()));

        // 6. Buku tertua
        System.out.println("\n===============================");
        System.out.println("         BUKU TERTUA           ");
        System.out.println("===============================");
        Buku21 tertua = bst.cariBukuTertua(bst.getRoot());
        if (tertua != null) {
            tertua.tampilInformasi();
        }
        System.out.println("===============================");
    }
}
