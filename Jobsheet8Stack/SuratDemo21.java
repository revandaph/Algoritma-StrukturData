package Jobsheet8Stack;

import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {
        StackSurat21 stack = new StackSurat21(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat21 surat = new Surat21(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil diterima.\n", nama);
                    break;

                case 2:
                    Surat21 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari  : " + proses.namaMahasiswa);
                        System.out.println("Kelas                 : " + proses.kelas);
                        System.out.println("Jenis Izin            : " + (proses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi                : " + proses.durasi + " hari");
                        System.out.println("Surat berhasil divalidasi.");
                    }
                    break;

                case 3:
                    Surat21 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir masuk dari : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas                     : " + terakhir.kelas);
                        System.out.println("Jenis Izin                : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi                    : " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}