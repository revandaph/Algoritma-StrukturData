package Jobsheet3ArrayObject;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswaa21[] arrayOfMahasiswaa21 = new Mahasiswaa21[3];
        String dummy;

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
            dummy = sc.nextLine();
            arrayOfMahasiswaa21[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM : " + arrayOfMahasiswaa21[i].nim);
            System.out.println("Nama : " + arrayOfMahasiswaa21[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswaa21[i].kelas);
            System.out.println("IPK : " + arrayOfMahasiswaa21[i].ipk);
            System.out.println("-------------------------------");
        }

    }
}
