package Jobsheet12DoubleLinkedList.Tugas;

public class Soal3_Latihan {

    static class NodeSLL {
        String data;
        NodeSLL next;

        NodeSLL(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static NodeSLL removeLast(NodeSLL head) { 
        if (head == null) {
            System.out.println("Playlist kosong.");
            return null;
        }
        if (head.next == null) {             
            System.out.println("Menghapus: " + head.data);
            return null;
        }

        NodeSLL current = head;
        while (current.next.next != null) {   
            current = current.next;
        }
        System.out.println("Menghapus lagu: " + current.next.data); 
        current.next = null;                
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
        NodeSLL head = new NodeSLL("LaguA"); 
        head.next = new NodeSLL("LaguB");    
        head.next.next = new NodeSLL("LaguC"); 

        System.out.println("Playlist sebelum dihapus:");
        print(head);

        head = removeLast(head); 

        System.out.println("Playlist setelah LaguC dihapus:");
        print(head); 
    }
}