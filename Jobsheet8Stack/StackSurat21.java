package Jobsheet8Stack;

public class StackSurat21 {
    Surat21[] stack;
    int size;
    int top;

    public StackSurat21(int size) {
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat21 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat21 pop() {
        if (!isEmpty()) {
            Surat21 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat21 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat   : " + stack[i].idSurat);
                System.out.println("Nama       : " + stack[i].namaMahasiswa);
                System.out.println("Kelas      : " + stack[i].kelas);
                System.out.println("Jenis Izin : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi     : " + stack[i].durasi + " hari");
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }
}