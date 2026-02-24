package Jobsheet3ArrayObject;

import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int n = Integer.parseInt(sc.nextLine());
        
        MataKuliahh21[] arrayOfMatakuliah = new MataKuliahh21[n];

        for (int i = 0; i < n; i++) {
            arrayOfMatakuliah[i] = new MataKuliahh21();
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].tambahData();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}