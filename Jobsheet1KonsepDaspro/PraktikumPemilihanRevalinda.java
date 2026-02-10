package Jobsheet1KonsepDaspro;

import java.util.Scanner;

public class PraktikumPemilihanRevalinda {
    public static void main(String[] args) {
        double tugas, kuiz, uts, uas, nilaiAkhir;
        String nilaiHuruf, statusKelulusan;
        Scanner reva = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("/n==============================");

        System.out.print("Masukkan nilai tugas  : ");
        tugas = reva.nextDouble();
        System.out.print("Masukkan nilai kuiz : ");
        kuiz = reva.nextDouble();
        System.out.print("Masukkan nilai UTS  : ");
        uts = reva.nextDouble();
        System.out.print("Masukkan nilai UAS  : ");
        uas = reva.nextDouble();

        if (tugas<0 || tugas>100 || kuiz<0 || kuiz>100 || uts<0 || uts>100 || uas<0 || uas>100) {
            
            System.out.println("/n==============================");
            System.out.println("Nilai tidak valid!");
            System.out.println("/n==============================");
            
        } else {
            
            nilaiAkhir = (0.2*tugas) + (0.2*kuiz) + (0.3*uts) + (0.4*uas);
            
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                statusKelulusan = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                statusKelulusan = "TIDAK LULUS";
            }
            
            System.out.println("/n==============================");
            System.out.printf("Nilai akhir : %.1f\n", nilaiAkhir);
            System.out.printf("Nilai Huruf : %s\n", nilaiHuruf);
            System.out.println("/n==============================");
            System.out.printf("Anda Dinyatakan %s\n", statusKelulusan);
        }
        reva.close();
    }
}