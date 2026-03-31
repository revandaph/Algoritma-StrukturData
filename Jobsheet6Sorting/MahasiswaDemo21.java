package Jobsheet6Sorting;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        Mahasiswa21 m1 = new Mahasiswa21("123", "Zidan", "2A", 3.2);
        Mahasiswa21 m2 = new Mahasiswa21("124", "Ayu", "2A", 3.5);
        Mahasiswa21 m3 = new Mahasiswa21("125", "Sofi", "2A", 3.1);
        Mahasiswa21 m4 = new Mahasiswa21("126", "Sita", "2A", 3.9);
        Mahasiswa21 m5 = new Mahasiswa21("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}