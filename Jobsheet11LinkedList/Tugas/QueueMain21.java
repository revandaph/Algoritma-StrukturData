package Jobsheet11LinkedList.Tugas;

import java.util.Scanner;

public class QueueMain21 {

    public static void main(String[] args) {

        QueueLinkedList21 antrian = new QueueLinkedList21();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        System.out.println("==========================================");
        System.out.println("  ANTRIAN LAYANAN UNIT KEMAHASISWAAN");
        System.out.println("==========================================");

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Daftar antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("3. Tampilkan semua antrian");
            System.out.println("4. Lihat antrian terdepan");
            System.out.println("5. Lihat antrian paling akhir");
            System.out.println("6. Jumlah mahasiswa mengantri");
            System.out.println("7. Cek antrian kosong");
            System.out.println("8. Cek antrian penuh");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.println("------------------");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("--- Daftar Antrian ---");
                    System.out.print("NIM   : "); String nim   = sc.nextLine();
                    System.out.print("Nama  : "); String nama  = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    System.out.print("IPK   : "); double ipk   = Double.parseDouble(sc.nextLine());
                    antrian.enqueue(new Mahasiswa21(nim, nama, kelas, ipk));
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.tampilAntrian();
                    break;

                case 4:
                    antrian.lihatDepan();
                    break;

                case 5:
                    antrian.lihatBelakang();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    if (antrian.isEmpty())
                        System.out.println("Antrian kosong.");
                    else
                        System.out.println("Antrian tidak kosong.");
                    break;

                case 8:
                    if (antrian.isFull())
                        System.out.println("Antrian penuh.");
                    else
                        System.out.println("Antrian belum penuh.");
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
