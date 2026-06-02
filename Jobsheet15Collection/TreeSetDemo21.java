package Jobsheet15Collection;

import java.util.TreeSet;

public class TreeSetDemo21 {

    public static void main(String[] args) {

        // LANGKAH 2-3: TreeSet of String, add, cetak
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        System.out.println("=== Langkah 3: cetak fruits ===");
        for (String temp : fruits) {
            System.out.println(temp);
        }

        // LANGKAH 5-6: first, last, remove, pollFirst, pollLast
        System.out.println("\nFirst: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("Setelah remove " + fruits);

        fruits.pollFirst();
        System.out.println("Setelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("Setelah poll last " + fruits);
    }
}