package QuizSatu;

public class QuizMataKuliah21 {
    String kodeMK;
    String namaMK;
    int sks;

    public QuizMataKuliah21(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("\nKode Mata Kuliah    : "  + kodeMK);
        System.out.println("Nama Mata Kulih     : " + namaMK);
        System.out.println("SKS                 : " + sks);
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    public void ubahSks(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak oleh kurang dari 2!");
        }
    }
}
