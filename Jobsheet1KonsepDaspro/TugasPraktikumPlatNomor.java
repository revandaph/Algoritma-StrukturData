package Jobsheet1KonsepDaspro;

import java.util.Scanner;

public class TugasPraktikumPlatNomor {
    public static void main(String[] args) {
        Scanner reva = new Scanner(System.in);

        char[] kodeWilayah = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] kotaWilayah = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Masukkan kode plat : ");
        char kodeInput = reva.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kodeWilayah.length; i++) {
            if (kodeInput == kodeWilayah[i]) {
                ditemukan = true;
                System.out.print("Kota : ");
                for (int j = 0; j < kotaWilayah[i].length; j++) {
                    System.out.print(kotaWilayah[i][j]);
                }
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }

        reva.close();
    }
}

