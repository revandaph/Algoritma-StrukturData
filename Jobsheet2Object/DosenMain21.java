package Jobsheet2Object;

public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "DSN202";
        dsn1.nama = "Ibu Wilda Imama Sabilla, S.Kom., M.Kom.";
        dsn1.bidangKeahlian = "Basis Data";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2020;
        dsn1.tampilInformasi();

        dsn1.ubahKeahlian("Praktikum Basis Data");
        System.out.println("Masa kerja Dosen        : " + dsn1.hitungMasaKerja(2026));
        dsn1.setStatusAktif(true);
        dsn1.tampilInformasi();
        
        Dosen21 dsn2 = new Dosen21
        ("DSN204",
        "Ibu Dr. Rina Kartikasari, S.T., M.T.",
        "Kewarganegaraan",
        false,
        2015);
        dsn2.tampilInformasi();
        
        dsn2.ubahKeahlian("Pancasila");
        System.out.println("Masa kerja Dosen       : " + dsn2.hitungMasaKerja(2026));
        dsn2.setStatusAktif(false);
        dsn2.tampilInformasi();
    }
}
