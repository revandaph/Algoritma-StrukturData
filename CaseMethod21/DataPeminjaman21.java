package CaseMethod21;

public class DataPeminjaman21 {
    DataMahasiswa21 mhs;
    DataBuku21 buku;
    String tanggalPinjam;
    String tanggalKembali;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public DataPeminjaman21(DataMahasiswa21 mhs, DataBuku21 buku, String tanggalPinjam, String tanggalKembali, int lamaPinjam) {
        this.mhs            = mhs;
        this.buku           = buku;
        this.tanggalPinjam  = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.lamaPinjam     = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam >= batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda     = terlambat * 2000;
        } else {
            terlambat = 0;
            denda     = 0;
        }
    }

    public void tampilPeminjaman() {
        String status;
        if (denda > 0) {
            status = "TERLAMBAT " + terlambat + " hari | Denda: Rp " + denda;
        } else {
            status = "Tepat Waktu | Denda: Rp 0";
        }

        System.out.println(
            mhs.nama        + " | " +
            buku.judul      + " | " +
            "Pinjam: "      + tanggalPinjam  + " | " +
            "Kembali: "     + tanggalKembali + " | " +
            "Lama: "        + lamaPinjam     + " hari | " +
            status
        );
    }
}
