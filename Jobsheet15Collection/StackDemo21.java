package Jobsheet15Collection;

import java.util.Stack;

public class StackDemo21 {

    public static void main(String[] args) {

        //LANGKAH 2-3: buat Book, push ke Stack
        Book21 book1 = new Book21("1234", "Dasar Pemrograman");  
        Book21 book2 = new Book21("7145", "Hafalah Shalat Delisa"); 
        Book21 book3 = new Book21("3562", "Muhammad Al-Fatih");  

        Stack<Book21> books = new Stack<>(); 
        books.push(book1);
        books.push(book2);
        books.push(book3);

        //LANGKAH 4: peek
        System.out.println("=== Langkah 4: peek ===");
        Book21 temp = books.peek(); 
        if (temp != null) {
            System.out.println(temp.toString());
        }

        //LANGKAH 4: pop
        Book21 temp2 = books.pop(); 
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        //LANGKAH 6: looping cetak stack
        System.out.println("\n=== Langkah 6: isi stack setelah pop ===");
        for (Book21 book : books) { 
            System.out.println(book.toString());
        }

        //LANGKAH 7: print langsung
        System.out.println("\n=== Langkah 7: print langsung ===");
        System.out.println(books);

        //LANGKAH 8: search
        System.out.println("\n=== Langkah 8: search book1 ===");
        System.out.println("Posisi book1: " + books.search(book1));
    }
}