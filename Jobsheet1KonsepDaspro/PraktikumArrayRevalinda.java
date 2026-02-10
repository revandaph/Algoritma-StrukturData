package Jobsheet1KonsepDaspro;

import java.util.Scanner;

public class PraktikumArrayRevalinda {
    public static void main(String[] args) {
        Scanner reva = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thingking & Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2,2,2,3,2,2,1,2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiIPK = new double[mataKuliah.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("Program Menghitung IP Semester\n");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk Mata Kuliah " + mataKuliah[i] + " : ");
            nilaiAngka[i] = reva.nextDouble();
        }

        for (int i = 0; i < mataKuliah.length; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiIPK[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiIPK[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiIPK[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiIPK[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiIPK[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiIPK[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiIPK[i] = 0;
            }

            totalBobot += nilaiIPK[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-40s %-15s %-15s %-15s\n",
                "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",
                mataKuliah[i],
                nilaiAngka[i],
                nilaiHuruf[i],
                nilaiIPK[i]);
        }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("IP Semester : %.2f\n", ip);

        reva.close();
    }
}
