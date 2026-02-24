package Jobsheet3ArrayObject;
import java.util.Scanner;
public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliahh21[] arrayOfMatakuliah = new MataKuliahh21[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].tambahData();
            System.out.println("-------------------------------------");
        }
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}