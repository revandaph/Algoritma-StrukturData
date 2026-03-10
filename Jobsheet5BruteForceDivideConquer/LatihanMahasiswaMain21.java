package Jobsheet5BruteForceDivideConquer;

import java.util.Scanner;

public class LatihanMahasiswaMain21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        LatihanMahasiswa21[] mhs = new LatihanMahasiswa21[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData mahasiswa ke-" + (i+1));

            System.out.print("Nama          : ");
            String nama = input.nextLine();

            System.out.print("NIM           : ");
            String nim = input.nextLine();

            System.out.print("Tahun Masuk   : ");
            int tahun = input.nextInt();

            System.out.print("Nilai UTS     : ");
            int uts = input.nextInt();

            System.out.print("Nilai UAS     : ");
            int uas = input.nextInt();
            input.nextLine();

            mhs[i] = new LatihanMahasiswa21(nama, nim, tahun, uts, uas);
        }

        int maxUTS = LatihanMahasiswa21.maxUTS(mhs, 0, mhs.length - 1);
        int minUTS = LatihanMahasiswa21.minUTS(mhs, 0, mhs.length - 1);
        double rataUAS = LatihanMahasiswa21.rataUAS(mhs);

        System.out.println("Nilai UTS Tertinggi : " + maxUTS);
        System.out.println("Nilai UTS Terendah : " + minUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}