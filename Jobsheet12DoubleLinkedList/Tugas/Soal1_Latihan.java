package Jobsheet12DoubleLinkedList.Tugas;

public class Soal1_Latihan {

    static class NodeSLL {
        String data;
        NodeSLL next;

        NodeSLL(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static int hitungGerbong(NodeSLL head) { 
        int total = 0;           
        NodeSLL current = head;              
        while (current != null) {       
            total++;  
            current = current.next;
        }
        return total;
    }

    public static void main(String[] args) {
        NodeSLL head = new NodeSLL("A"); 
        head.next = new NodeSLL("B");
        head.next.next = new NodeSLL("C"); 

        int total = hitungGerbong(head);
        System.out.println("Total gerbong dalam rangkaian: " + total);
    }
}