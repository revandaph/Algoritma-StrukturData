package QuizSatu;
public class QuizMahasiswaMain21 {
    public static void main(String[] args) {

        QuizMataKuliah21 mk1 = new QuizMataKuliah21("ASD21", "Algoritma", 3);
        QuizMataKuliah21 mk2 = new QuizMataKuliah21("PBD21", "Basis Data", 3);
        QuizMataKuliah21 mk3 = new QuizMataKuliah21("KWN21", "Kewarganegaraan", 3);
        QuizMataKuliah21 mk4 = new QuizMataKuliah21("BSN21", "Bisnis Digital", 2);

        QuizMahasiswa21 mhs1 = new QuizMahasiswa21("254107060053", "Revalinda", 2024, 4);

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);
        mhs1.tambahMataKuliah(mk4);

        mhs1.tampilkanInfo();
    }
}
