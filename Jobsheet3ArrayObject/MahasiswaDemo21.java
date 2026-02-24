package Jobsheet3ArrayObject;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswaa21[] arrayOfMahasiswaa21 = new Mahasiswaa21[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswaa21[i] = new Mahasiswaa21();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            arrayOfMahasiswaa21[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayOfMahasiswaa21[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswaa21[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            arrayOfMahasiswaa21[i].ipk = Float.parseFloat(sc.nextLine());
            System.out.println("-------------------------------");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswaa21[i].cetakInfo();
        }
    }
}
