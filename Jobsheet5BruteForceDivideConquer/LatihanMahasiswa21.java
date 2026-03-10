package Jobsheet5BruteForceDivideConquer;

public class LatihanMahasiswa21 {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    LatihanMahasiswa21(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    static int maxUTS(LatihanMahasiswa21 arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);
        return (lmax > rmax) ? lmax : rmax;
    }

    static int minUTS(LatihanMahasiswa21 arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);
        return (lmin < rmin) ? lmin : rmin;
    }

    static double rataUAS(LatihanMahasiswa21 arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return (double) total / arr.length;
    }
}
