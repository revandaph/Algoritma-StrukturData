package Jobsheet11LinkedList.Tugas;

public class QueueLinkedList21 {

    private Node21 front;
    private Node21 rear;
    private int       size;
    private final int MAX_SIZE = 10;

    public QueueLinkedList21() {
        front = null;
        rear  = null;
        size  = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    public void clear() {
        front = null;
        rear  = null;
        size  = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa21 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! " + mhs.nama + " tidak dapat masuk.");
            return;
        }
        Node21 node = new Node21(mhs, null);
        if (isEmpty()) {
            front = node;
            rear  = node;
        } else {
            rear.next = node;
            rear      = node;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian. (posisi ke-" + size + ")");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dapat dipanggil.");
            return;
        }
        System.out.println("Memanggil : ");
        front.data.tampilInformasi();
        if (front == rear) {
            front = null;
            rear  = null;
        } else {
            front = front.next;
        }
        size--;
        System.out.println("Sisa antrian: " + size + " mahasiswa.\n");
    }

    public void lihatDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilInformasi();
        }
    }

    public void lihatBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilInformasi();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("===== DAFTAR ANTRIAN =====");
            Node21 tmp = front;
            int no = 1;
            while (tmp != null) {
                System.out.print(no + ". ");
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                no++;
            }
            System.out.println("==========================");
        }
    }
}
