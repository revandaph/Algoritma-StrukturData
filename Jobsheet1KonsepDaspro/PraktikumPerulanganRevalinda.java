package Jobsheet1KonsepDaspro;

import java.util.Scanner;

public class PraktikumPerulanganRevalinda {
    public static void main(String[] args) {
        long nim;
        Scanner reva = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        nim = reva.nextLong();

        int n = (int) (nim % 100);

        if (n < 10) {
            n = n + 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        reva.close();
    }
}
