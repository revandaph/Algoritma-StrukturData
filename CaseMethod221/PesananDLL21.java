package CaseMethod221;

// Struktur data daftar pesanan menggunakan Doubly Linked List
// Menyimpan riwayat pesanan yang sudah dilayani, bisa diurutkan dan dicetak
public class PesananDLL21 {
    Pesanan21 head;
    Pesanan21 tail;

    PesananDLL21() {
        head = null;
        tail = null;
    }

    // Sisipkan pesanan baru di tail
    // Jika kosong → node jadi head sekaligus tail
    // Jika tidak  → sambungkan ke tail lama, geser tail
    void tambahPesanan(Pesanan21 baru) {
        baru.prev = null;
        baru.next = null;

        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail      = baru;
        }
    }

    // Bubble sort: urutkan pesanan berdasarkan nama pesanan A–Z
    // Menukar nilai data antar node (bukan pointer), ulangi sampai tidak ada pertukaran
    void sortByNama() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped       = false;
            Pesanan21 curr = head;

            while (curr.next != null) {
                // Jika urutan nama salah, tukar data kedua node
                if (curr.namaPesanan.compareToIgnoreCase(curr.next.namaPesanan) > 0) {
                    int    tempKode    = curr.kodePesanan;
                    String tempNama    = curr.namaPesanan;
                    int    tempHarga   = curr.harga;
                    String tempPembeli = curr.namaPembeli;

                    curr.kodePesanan  = curr.next.kodePesanan;
                    curr.namaPesanan  = curr.next.namaPesanan;
                    curr.harga        = curr.next.harga;
                    curr.namaPembeli  = curr.next.namaPembeli;

                    curr.next.kodePesanan = tempKode;
                    curr.next.namaPesanan = tempNama;
                    curr.next.harga       = tempHarga;
                    curr.next.namaPembeli = tempPembeli;

                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    // [MODIFIKASI] Metode baru: cari pesanan dengan harga tertinggi
    // Traversal seluruh list, simpan node dengan harga terbesar yang ditemukan
    // Dikembalikan sebagai objek Pesanan21 agar bisa diakses nama & harga-nya
    Pesanan21 cariHargaTertinggi() {
        if (head == null) return null;

        Pesanan21 maks    = head; // Asumsikan head sebagai maks awal
        Pesanan21 current = head.next;

        while (current != null) {
            // Jika harga node saat ini lebih besar, perbarui referensi maks
            if (current.harga > maks.harga) {
                maks = current;
            }
            current = current.next;
        }
        return maks;
    }

    // [MODIFIKASI] Metode baru: cari pesanan dengan harga terendah
    // Traversal seluruh list, simpan node dengan harga terkecil yang ditemukan
    // Dikembalikan sebagai objek Pesanan21 agar bisa diakses nama & harga-nya
    Pesanan21 cariHargaTerendah() {
        if (head == null) return null;

        Pesanan21 min     = head; // Asumsikan head sebagai min awal
        Pesanan21 current = head.next;

        while (current != null) {
            // Jika harga node saat ini lebih kecil, perbarui referensi min
            if (current.harga < min.harga) {
                min = current;
            }
            current = current.next;
        }
        return min;
    }

    // Urutkan pesanan, lalu traversal dari head ke tail untuk cetak laporan dan total harga
    // [MODIFIKASI] Ditambahkan pemanggilan cariHargaTertinggi() dan cariHargaTerendah()
    // untuk menampilkan ringkasan harga di akhir laporan
    void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan masuk.");
            return;
        }

        sortByNama();

        System.out.println("=============================================");
        System.out.println("         LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=============================================");
        System.out.printf("%-15s %-20s %-15s %-15s%n",
                "Kode Pesanan", "Nama Pesanan", "Harga", "Nama Pembeli");

        int       total   = 0;
        Pesanan21 current = head;
        while (current != null) {
            // [MODIFIKASI] Tambah kolom Nama Pembeli di setiap baris laporan
            System.out.printf("%-15d %-20s %-15d %-15s%n",
                    current.kodePesanan, current.namaPesanan,
                    current.harga,       current.namaPembeli);
            total  += current.harga;
            current = current.next;
        }

        System.out.println("=============================================");
        System.out.println("Total Pendapatan : " + total);

        // [MODIFIKASI] Blok baru: tampilkan pesanan harga tertinggi & terendah
        // Memanggil kedua metode pencarian di atas lalu mencetak hasilnya
        Pesanan21 tertinggi = cariHargaTertinggi();
        Pesanan21 terendah  = cariHargaTerendah();

        System.out.println("---------------------------------------------");
        System.out.println("Pesanan Harga Tertinggi :");
        System.out.printf("  %-20s | Harga : %d | Pembeli : %s%n",
                tertinggi.namaPesanan, tertinggi.harga, tertinggi.namaPembeli);

        System.out.println("Pesanan Harga Terendah  :");
        System.out.printf("  %-20s | Harga : %d | Pembeli : %s%n",
                terendah.namaPesanan, terendah.harga, terendah.namaPembeli);
        System.out.println("=============================================");
    }

    boolean isEmpty() {
        return head == null;
    }
}
