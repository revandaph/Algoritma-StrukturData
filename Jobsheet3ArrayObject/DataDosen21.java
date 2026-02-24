package Jobsheet3ArrayObject;

import java.util.Scanner;

public class DataDosen21 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public void tambahData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode Dosen      : ");
        kode = sc.nextLine();

        System.out.print("Nama Dosen      : ");
        nama = sc.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        String jk = sc.nextLine().toUpperCase();
        jenisKelamin = jk.equals("L");

        System.out.print("Usia            : ");
        usia = Integer.parseInt(sc.nextLine());

        System.out.println("-----------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode Dosen      : " + kode);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia            : " + usia);
        System.out.println("-----------------------------");
    }
}