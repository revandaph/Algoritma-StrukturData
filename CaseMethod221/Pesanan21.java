package CaseMethod221;

// Node untuk Doubly Linked List daftar pesanan
// Setiap node menyimpan satu data pesanan dan punya pointer prev/next
public class Pesanan21 {
    int       kodePesanan;  // Kode unik pesanan
    String    namaPesanan;  // Nama item yang dipesan
    int       harga;        // Harga pesanan
    String    namaPembeli;  // Nama pembeli pemilik pesanan
    Pesanan21 prev;         // Pointer ke node sebelumnya
    Pesanan21 next;         // Pointer ke node sesudahnya

    // Buat node pesanan baru; prev dan next null karena belum terhubung ke list
    public Pesanan21(int a, String b, int d, String namaPembeli) {
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga       = d;
        this.namaPembeli = namaPembeli;
        this.prev        = null;
        this.next        = null;
    }
}
