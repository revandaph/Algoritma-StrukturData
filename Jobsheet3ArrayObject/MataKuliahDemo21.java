package Jobsheet3ArrayObject;

import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        MataKuliahh21[] arrayOfMatakuliah = new MataKuliahh21[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah[i] = new MataKuliahh21();
            arrayOfMatakuliah[i].tambahData();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
