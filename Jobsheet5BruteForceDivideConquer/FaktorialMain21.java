package Jobsheet5BruteForceDivideConquer;

import java.util.Scanner;

public class FaktorialMain21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial21 fk = new Faktorial21();
        System.out.print("Nilai faktorial" + nilai +
        "menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.print("\nNilai faktorial " + nilai +
        "menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
