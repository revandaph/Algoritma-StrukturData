package CaseMethod221;

// Node untuk Doubly Linked List antrian pembeli
// Setiap node punya pointer prev dan next untuk sambungan dua arah
public class Pembeli21 {
    int       noAntrian;   // Nomor urut antrian
    String    namaPembeli; // Nama pembeli
    String    noHp;        // Nomor HP pembeli
    Pembeli21 prev;        // Pointer ke node sebelumnya
    Pembeli21 next;        // Pointer ke node sesudahnya

    // Buat node baru; prev dan next null karena belum terhubung ke list
    public Pembeli21(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian   = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp        = noHp;
        this.prev        = null;
        this.next        = null;
    }
}
