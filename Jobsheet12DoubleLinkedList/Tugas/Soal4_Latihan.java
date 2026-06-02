package Jobsheet12DoubleLinkedList.Tugas;

public class Soal4_Latihan {
     static class Node {
        String data;
        Node prev;
        Node next;
        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
 
    static class DoubleLinkedList {
        Node head;
        Node tail;
 
        void addLast(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
 
        // Traversal dari tail ke head menggunakan pointer prev
        void printReverse() {
            Node current = tail;
            System.out.print("Riwayat lagu (terbaru -> pertama): ");
            while (current != null) {
                System.out.print(current.data);
                if (current.prev != null) System.out.print(" -> ");
                current = current.prev;
            }
            System.out.println();
        }
 
        void print() {
            Node current = head;
            System.out.print("Urutan normal (pertama -> terbaru): ");
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) System.out.print(" <-> ");
                current = current.next;
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addLast("Rock");
        dll.addLast("Jazz");
        dll.addLast("Pop");
 
        dll.print();
        dll.printReverse();
    }
}