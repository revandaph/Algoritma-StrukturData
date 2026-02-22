package Jobsheet2Object;

public class Dosen21 {
    String idDosen, nama, bidangKeahlian;
    Boolean statusAktif;
    int tahunBergabung;

    public Dosen21() {
    }

    public Dosen21(String idDosen, String nama, String bidangKeahlian, Boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilInformasi(){
        System.out.println("\nID Dosen               : " + idDosen);
        System.out.println("Nama Dosen             : " + nama);
        System.out.println("Bidang Keahlian Dosen  : " + bidangKeahlian);
        System.out.println("Status Keaktifan Dosen : " + statusAktif);
        System.out.println("Tahun Bergabung Dosen  : " + tahunBergabung);
    }

    void setStatusAktif(boolean status) {
        if (status) {
            System.out.println("Aktif.");
        } else {
            System.out.println("Tidak Aktif.");
        }
    }

    String hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja + " tahun";
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public static void main(String[] args) {
        Dosen21 dsn = new Dosen21();
        dsn.idDosen = "DSN312";
        dsn.nama = "Ibu Triana Fatmawati,S.T., M.T.";
        dsn.bidangKeahlian = "Algoritma dan Struktur Data";
        dsn.statusAktif = true;
        dsn.tahunBergabung = 2014;
        dsn.tampilInformasi();

        dsn.ubahKeahlian("Dasar Pemrograman");
        System.out.println("Masa kerja Dosen       : " + dsn.hitungMasaKerja(2026));
        dsn.setStatusAktif(true);
        dsn.tampilInformasi();
    }
}
