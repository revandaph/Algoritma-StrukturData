package UASPrakt21;

public class BinarySearchTreeBuku21 {
    private NodeBuku21 root;

    public BinarySearchTreeBuku21() {
        this.root = null;
    }

    public NodeBuku21 getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Buku21 data) {
        NodeBuku21 newNode = new NodeBuku21(data);

        if (isEmpty()) {
            root = newNode;
            return;
        }

        NodeBuku21 current = root;
        NodeBuku21 parent = null;

        while (current != null) {
            parent = current;
            if (data.kodeBuku.compareTo(current.data.kodeBuku) < 0) {
                current = current.left;
            } else if (data.kodeBuku.compareTo(current.data.kodeBuku) > 0) {
                current = current.right;
            } else {
                System.out.println("Kode buku " + data.kodeBuku + " sudah ada dalam tree.");
                return;
            }
        }

        if (data.kodeBuku.compareTo(parent.data.kodeBuku) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public boolean find(String kodeBuku) {
        NodeBuku21 current = root;

        while (current != null) {
            int cmp = kodeBuku.compareTo(current.data.kodeBuku);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void traverseInOrder(NodeBuku21 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println("-------------------------------");
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(NodeBuku21 node) {
        if (node != null) {
            System.out.println("-------------------------------");
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public int hitungJumlahBuku(NodeBuku21 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahBuku(node.left) + hitungJumlahBuku(node.right);
    }

    public Buku21 cariBukuTertua(NodeBuku21 node) {
        if (node == null) {
            return null;
        }

        Buku21 tertua = node.data;

        Buku21 kiriTertua = cariBukuTertua(node.left);
        Buku21 kananTertua = cariBukuTertua(node.right);

        if (kiriTertua != null && kiriTertua.tahunTerbit < tertua.tahunTerbit) {
            tertua = kiriTertua;
        }
        if (kananTertua != null && kananTertua.tahunTerbit < tertua.tahunTerbit) {
            tertua = kananTertua;
        }

        return tertua;
    }
}
