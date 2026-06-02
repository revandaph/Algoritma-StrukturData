package Jobsheet15Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo21 {

    public static void main(String[] args) {

        // Sorting String
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println("=== Sort String ===");
        System.out.println(daftarSiswa);

        // Sorting object Customer by name
        ArrayList<Customer21> customers = new ArrayList<>();
        customers.add(new Customer21(1, "Zakia")); 
        customers.add(new Customer21(5, "Budi"));  
        customers.add(new Customer21(4, "Cica"));  
        customers.add(new Customer21(100, "Rosa"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println("\n=== Sort Customer by name ===");
        System.out.println(customers);
    }
}