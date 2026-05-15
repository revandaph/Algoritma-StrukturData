package CaseMethod221;

// Struktur data antrian pembeli menggunakan Doubly Linked List
// Menggunakan prinsip FIFO: pembeli masuk dari tail, dilayani dari head
public class AntrianDLL21 {
    Pembeli21 head;    // Node terdepan antrian (dilayani duluan)
    Pembeli21 tail;    // Node paling belakang antrian (baru masuk)
    int       counter; // Penomoran antrian otomatis

    AntrianDLL21() {
        head    = null;
        tail    = null;
        counter = 0;
    }

    // Enqueue: tambah pembeli baru di tail
    // Jika kosong → node jadi head sekaligus tail
    // Jika tidak  → sambungkan node baru ke tail lama, geser tail
    void tambahAntrian(String nama, String noHp) {
        counter++;
        Pembeli21 baru = new Pembeli21(counter, nama, noHp);

        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail      = baru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counter);
    }

    // Traversal dari head ke tail, cetak data setiap node
    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-20s %-15s%n", "No Antrian", "Nama", "No HP");

        Pembeli21 current = head;
        while (current != null) {
            System.out.printf("%-12d %-20s %-15s%n",
                    current.noAntrian, current.namaPembeli, current.noHp);
            current = current.next;
        }
    }

    // Dequeue: hapus dan kembalikan pembeli dari head (FIFO)
    // Jika satu node → head dan tail jadi null
    // Jika lebih     → geser head ke node berikutnya, putus tautan lama
    Pembeli21 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli21 hapus = head;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head      = head.next;
            head.prev = null;
        }

        hapus.next = null; // Isolasi node yang dihapus dari list
        return hapus;
    }

    boolean isEmpty() {
        return head == null;
    }
}
