package Jobsheet3ArrayObject;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Mahasiswaa21[] arrayOfMahasiswaa21 = new Mahasiswaa21[3];
        arrayOfMahasiswaa21[0] = new Mahasiswaa21();
        arrayOfMahasiswaa21[0].nim = "244107060033";
        arrayOfMahasiswaa21[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswaa21[0].kelas = "SIB-1E";
        arrayOfMahasiswaa21[0].ipk = (float)  3.75;

        arrayOfMahasiswaa21[1] = new Mahasiswaa21();
        arrayOfMahasiswaa21[1].nim = "2341720172";
        arrayOfMahasiswaa21[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswaa21[1].kelas = "TI-2A";
        arrayOfMahasiswaa21[1].ipk = (float)  3.36;

        arrayOfMahasiswaa21[2] = new Mahasiswaa21();
        arrayOfMahasiswaa21[2].nim = "244107023006";
        arrayOfMahasiswaa21[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswaa21[2].kelas = "TI-2E";
        arrayOfMahasiswaa21[2].ipk = (float)  3.80;

        System.out.println("NIM     :" + arrayOfMahasiswaa21[0].nim);
        System.out.println("Nama    :" + arrayOfMahasiswaa21[0].nama);
        System.out.println("Kelas   :" + arrayOfMahasiswaa21[0].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswaa21[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM     :" + arrayOfMahasiswaa21[1].nim);
        System.out.println("Nama    :" + arrayOfMahasiswaa21[1].nama);
        System.out.println("Kelas   :" + arrayOfMahasiswaa21[1].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswaa21[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM     :" + arrayOfMahasiswaa21[2].nim);
        System.out.println("Nama    :" + arrayOfMahasiswaa21[2].nama);
        System.out.println("Kelas   :" + arrayOfMahasiswaa21[2].kelas);
        System.out.println("IPK     :" + arrayOfMahasiswaa21[2].ipk);
        System.out.println("----------------------------------------");
    }
}
