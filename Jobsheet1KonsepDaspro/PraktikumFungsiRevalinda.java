package Jobsheet1KonsepDaspro;

public class PraktikumFungsiRevalinda {

    static int totalPendapatan(int[] stokBunga, int[] hargaBunga) {
        int totalPendapatan = 0;
        for (int i = 0; i < stokBunga.length; i++) {
            totalPendapatan += stokBunga[i] * hargaBunga[i];
        }
        return totalPendapatan;
    }

    static String cekStatusCabang(int pendapatanCabang) {
        if (pendapatanCabang > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    public static void main(String[] args) {
        int[][] dataStokBunga = {
            {10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}
        };

        int[] hargaBunga = {75000,50000,60000,10000};

        String[] cabangToko = {
            "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"
        };

        for (int i = 0; i < dataStokBunga.length; i++) {
            int pendapatanCabang = totalPendapatan(dataStokBunga[i], hargaBunga);
        
        String statusCabang = cekStatusCabang(pendapatanCabang);

        System.out.println(cabangToko[i]);
        System.out.println("Pendapatan  : Rp " + pendapatanCabang);
        System.out.println("Status      : " + statusCabang);
        System.out.println();
        }
    }
}