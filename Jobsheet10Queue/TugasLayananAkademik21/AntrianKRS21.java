package Jobsheet10Queue.TugasLayananAkademik21;

public class AntrianKRS21 {
    MahasiswaKRS21[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahSudahKRS;
    int kapasitasDPA;

    public AntrianKRS21(int max, int kapasitasDPA) {
        this.max = max;
        this.kapasitasDPA = kapasitasDPA;
        this.data = new MahasiswaKRS21[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahSudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public void tambahAntrian(MahasiswaKRS21 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. (Posisi: " + size + ")");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa untuk diproses.");
            return;
        }
        System.out.println("=== Memanggil mahasiswa untuk Proses KRS ===");
        int dipanggil = 0;
        while (dipanggil < 2 && !isEmpty()) {
            if (jumlahSudahKRS >= kapasitasDPA) {
                System.out.println("DPA sudah mencapai batas maksimal (" + kapasitasDPA + " mahasiswa).");
                break;
            }
            MahasiswaKRS21 mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahSudahKRS++;
            dipanggil++;
            System.out.print("Mahasiswa ke-" + jumlahSudahKRS + " diproses: ");
            mhs.tampilkanData();
        }
        if (dipanggil == 0) {
            System.out.println("Tidak ada mahasiswa yang dapat diproses.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Semua Antrian KRS:");
        System.out.println("No. NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void cetakSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + jumlahSudahKRS);
    }

    public void cetakBelumKRS() {
        System.out.println("Jumlah mahasiswa yang belum proses KRS (dalam antrian): " + size);
    }
}