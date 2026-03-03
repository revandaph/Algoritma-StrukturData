import QuizSatu.QuizMataKuliah21;

public class QuizMahasiswa21 {
    String nim;
    String nama;
    int tahunMasuk;
    QuizMataKuliah21[] mataKuliahDiambil;

    public QuizMahasiswa21(String nim, String nama, int tahunMasuk, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        mataKuliahDiambil = new QuizMataKuliah21[kapasitasMK];
    }

    public void tambahMataKuliah(QuizMataKuliah21 mataKuliah) {
        for (int i = 0; i < mataKuliahDiambil.length; i++) {
            if (mataKuliahDiambil[i] == null) {
                mataKuliahDiambil[i] = mataKuliah;
                return;
            }
        }
        System.out.println("Kapasitas mata kuliah penuh!");
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < mataKuliahDiambil.length; i++) {
            if (mataKuliahDiambil[i] != null) {
                total += mataKuliahDiambil[i].sks;
            }
        }
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("\nDaftar Mata Kuliah:");

        for (int i = 0; i < mataKuliahDiambil.length; i++) {
            if (mataKuliahDiambil[i] != null) {
                mataKuliahDiambil[i].tampilkanInfo();
            }
        }

        System.out.println("\nTotal SKS   : " + hitungTotalSKS());
        System.out.println("=============================");
    }
}
