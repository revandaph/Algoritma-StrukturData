package Jobsheet3ArrayObject;

import java.util.Scanner;

public class MataKuliahh21 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public MataKuliahh21(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        kode = sc.nextLine();
        System.out.print("Nama        : ");
        nama = sc.nextLine();
        System.out.print("Sks         : ");
        sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah jam  : ");
        jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("-------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-------------------------------");
    }
}
