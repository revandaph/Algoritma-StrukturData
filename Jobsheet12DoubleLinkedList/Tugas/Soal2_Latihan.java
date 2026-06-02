package Jobsheet12DoubleLinkedList.Tugas;

public class Soal2_Latihan {

    static class NodeSLL {
        String data;
        NodeSLL next;

        NodeSLL(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static NodeSLL addFirst(NodeSLL head, String data) {
        NodeSLL newNode = new NodeSLL(data); 
        newNode.next = head;               
        head = newNode;                   
        return head;             
    }

    static void print(NodeSLL head) { 
        NodeSLL current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // MODIF: buat rangkaian awal B -> C
        NodeSLL head = new NodeSLL("B"); 
        head.next = new NodeSLL("C");    

        System.out.println("Rangkaian sebelum sisipan:");
        print(head);

        head = addFirst(head, "A"); 

        System.out.println("Rangkaian setelah sisipan \"A\" di depan:");
        print(head); 
    }
}