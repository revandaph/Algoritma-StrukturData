package QuizSatu;

public class QuizMataKuliahMain21 {
    public static void main(String[] args) {
        QuizMataKuliah21 matkul1 = new QuizMataKuliah21("IF101", "Algoritma", 3);
        
        System.out.println("Data Awal Mata Kuliah 1: ");
        matkul1.tampilkanInfo();
        
        matkul1.ubahNamaMK("Algoritma dan Struktur Data");
        matkul1.ubahSks(4);
        
        System.out.println("\nData Setelah Perubahan: ");
        matkul1.tampilkanInfo();
        
        QuizMataKuliah21 matkul2 = new QuizMataKuliah21("IF101", "Algoritma", 3);
        System.out.println("\n\nData Awal Mata Kuliah 2: ");
        matkul2.tampilkanInfo();

        matkul2.ubahNamaMK("Basis Data");
        matkul2.ubahSks(1);

        System.out.println("\nData setelah perubahan");
        matkul2.tampilkanInfo();
    }
}
