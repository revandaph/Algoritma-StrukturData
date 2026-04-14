package CaseMethod21;

import java.util.Scanner;

public class PeminjamanMain21 {
    static Scanner sc = new Scanner(System.in);
    static void insertionSort(DataPeminjaman21[] data, int jumlah) {
        for (int i = 1; i < jumlah; i++) {
            DataPeminjaman21 kunci = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < kunci.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = kunci;
        }
    }

    static void binarySearch(DataPeminjaman21[] data, int jumlah, String nimCari) {
        DataPeminjaman21[] temp = new DataPeminjaman21[jumlah];
        for (int i = 0; i < jumlah; i++) {
            temp[i] = data[i];
        }

        for (int i = 1; i < jumlah; i++) {
            DataPeminjaman21 kunci = temp[i];
            int j = i - 1;
            while (j >= 0 && temp[j].mhs.nim.compareTo(kunci.mhs.nim) > 0) {
                temp[j + 1] = temp[j];
                j--;
            }
            temp[j + 1] = kunci;
        }

        int low  = 0;
        int high = jumlah - 1;
        int ketemu = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (temp[mid].mhs.nim.equals(nimCari)) {
                ketemu = mid;
                break;
            } else if (temp[mid].mhs.nim.compareTo(nimCari) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (ketemu == -1) {
            System.out.println("NIM " + nimCari + " tidak ditemukan.");
            return;
        }

        System.out.println("Data ditemukan:");

        for (int i = 0; i < jumlah; i++) {
            if (temp[i].mhs.nim.equals(nimCari)) {
                temp[i].tampilPeminjaman();
            }
        }
    }

    static boolean nimSudahAda(DataMahasiswa21[] data, int jumlah, String nim) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].nim.equals(nim)) {
                return true;
            }
        }
        return false;
    }

    static boolean kodeSudahAda(DataBuku21[] data, int jumlah, String kode) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].kodeBuku.equals(kode)) {
                return true;
            }
        }
        return false;
    }

    static DataMahasiswa21 cariMahasiswa(DataMahasiswa21[] data, int jumlah, String nim) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].nim.equals(nim)) {
                return data[i];
            }
        }
        return null;
    }

    static DataBuku21 cariBuku(DataBuku21[] data, int jumlah, String kode) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].kodeBuku.equals(kode)) {
                return data[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {

        DataMahasiswa21[]  dataMhs    = new DataMahasiswa21[50];
        DataBuku21[]       dataBuku   = new DataBuku21[50];
        DataPeminjaman21[] dataPinjam = new DataPeminjaman21[50];

        int jumlahMhs    = 0;
        int jumlahBuku   = 0;
        int jumlahPinjam = 0;

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Tambah Peminjaman");
            System.out.println("4. Tampilkan Mahasiswa");
            System.out.println("5. Tampilkan Buku");
            System.out.println("6. Tampilkan Peminjaman");
            System.out.println("7. Urutkan Peminjam Berdasarkan Denda");
            System.out.println("8. Cari Peminjam Berdasarkan NIM");
            System.out.println("9. Jumlah Transaksi Peminjaman");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(sc.nextLine());

            if (pilihan == 1) {
                System.out.println("-- Tambah Mahasiswa --");
                System.out.print("NIM   : "); String nim   = sc.nextLine();
                System.out.print("Nama  : "); String nama  = sc.nextLine();
                System.out.print("Prodi : "); String prodi = sc.nextLine();

                if (nimSudahAda(dataMhs, jumlahMhs, nim)) {
                    System.out.println("NIM sudah terdaftar!");
                } else {
                    dataMhs[jumlahMhs] = new DataMahasiswa21(nim, nama, prodi);
                    jumlahMhs++;
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                }

            } else if (pilihan == 2) {
                System.out.println("-- Tambah Buku --");
                System.out.print("Kode Buku    : "); String kode  = sc.nextLine();
                System.out.print("Judul        : "); String judul = sc.nextLine();
                System.out.print("Tahun Terbit : "); int tahun    = Integer.parseInt(sc.nextLine());

                if (kodeSudahAda(dataBuku, jumlahBuku, kode)) {
                    System.out.println("Kode buku sudah terdaftar!");
                } else {
                    dataBuku[jumlahBuku] = new DataBuku21(kode, judul, tahun);
                    jumlahBuku++;
                    System.out.println("Buku berhasil ditambahkan!");
                }

            } else if (pilihan == 3) {
                System.out.println("-- Tambah Peminjaman --");

                if (jumlahMhs == 0) {
                    System.out.println("Belum ada data mahasiswa!");
                } else if (jumlahBuku == 0) {
                    System.out.println("Belum ada data buku!");
                } else {
                    System.out.print("NIM Mahasiswa      : ");
                    String nim = sc.nextLine();
                    DataMahasiswa21 mhs = cariMahasiswa(dataMhs, jumlahMhs, nim);

                    if (mhs == null) {
                        System.out.println("NIM tidak ditemukan!");
                    } else {
                        System.out.print("Kode Buku          : ");
                        String kode = sc.nextLine();
                        DataBuku21 buku = cariBuku(dataBuku, jumlahBuku, kode);

                        if (buku == null) {
                            System.out.println("Kode buku tidak ditemukan!");
                        } else {
                            System.out.print("Tanggal Pinjam     : (DD-MM-YYYY) ");
                            String tglPinjam = sc.nextLine();

                            System.out.print("Tanggal Kembali    : (DD-MM-YYYY) ");
                            String tglKembali = sc.nextLine();

                            System.out.print("Lama Pinjam (hari) : ");
                            int lama = Integer.parseInt(sc.nextLine());

                            dataPinjam[jumlahPinjam] = new DataPeminjaman21(mhs, buku, tglPinjam, tglKembali, lama);
                            jumlahPinjam++;

                            DataPeminjaman21 p = dataPinjam[jumlahPinjam - 1];
                            System.out.println("Berhasil ditambahkan!");
                            if (p.denda > 0) {
                                System.out.println("Status: TERLAMBAT " + p.terlambat + " hari, Denda Rp " + p.denda);
                            } else {
                                System.out.println("Status: Tepat Waktu, tidak ada denda.");
                            }
                        }
                    }
                }

            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                if (jumlahMhs == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < jumlahMhs; i++) {
                        dataMhs[i].tampilMahasiswa();
                    }
                }

            } else if (pilihan == 5) {
                System.out.println("Daftar Buku:");
                if (jumlahBuku == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < jumlahBuku; i++) {
                        dataBuku[i].tampilBuku();
                    }
                }

            } else if (pilihan == 6) {
                System.out.println("Data Peminjaman:");
                if (jumlahPinjam == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < jumlahPinjam; i++) {
                        dataPinjam[i].tampilPeminjaman();
                    }
                }

            } else if (pilihan == 7) {
                if (jumlahPinjam == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    DataPeminjaman21[] salinan = new DataPeminjaman21[jumlahPinjam];
                    for (int i = 0; i < jumlahPinjam; i++) {
                        salinan[i] = dataPinjam[i];
                    }

                    insertionSort(salinan, jumlahPinjam);

                    System.out.println("Urutan Denda Terbesar:");
                    for (int i = 0; i < jumlahPinjam; i++) {
                        salinan[i].tampilPeminjaman();
                    }
                }

            } else if (pilihan == 8) {
                if (jumlahPinjam == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.nextLine();
                    binarySearch(dataPinjam, jumlahPinjam, nimCari);
                }

            } else if (pilihan == 9) {
                System.out.println("Total transaksi peminjaman: " + jumlahPinjam);
            
            } else if (pilihan == 0) {
                System.out.println("Program selesai. Terima kasih!");

            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
