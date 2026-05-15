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

    // Urutkan pesanan, lalu traversal dari head ke tail untuk cetak laporan dan total harga
    void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan masuk.");
            return;
        }

        sortByNama();

        System.out.println("=============================================");
        System.out.println("         LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=============================================");
        System.out.printf("%-15s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        int       total   = 0;
        Pesanan21 current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d%n",
                    current.kodePesanan, current.namaPesanan, current.harga);
            total  += current.harga;
            current = current.next;
        }
        System.out.println("=============================================");
        System.out.println("Total Pendapatan : " + total);
    }

    boolean isEmpty() {
        return head == null;
    }
}
