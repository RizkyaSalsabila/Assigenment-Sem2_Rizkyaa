package Tugas;

public class BinaryTree24 {
    //atribut
    Node24 root;

    //konstruktor default
    public BinaryTree24() {
        root = null;
    }

    //NOMER 1
    //method untuk menambahkan node scr rekursif 'add'
    public void add(int data) {
        root = addRekursif(root, data);
    }

    private Node24 addRekursif(Node24 current, int data) {
        if (current == null) {
            return new Node24(data);
        } else if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    //NOMER 2
    // //method untuk menampilkan nilai paling kecil
    public int cariMin() {
        if (root == null) {
            System.out.println("Data tree masih kosong");
            System.out.println("Silahkan isi data tree terlebih dahulu...");
            return -1;
        } else {
            Node24 current = root;
            while (current.left != null) {
                current = current.left;
            }
            return current.data;
        }
    }

    //method untuk menampilkan nilai paling besar
    public int cariMax() {
        if (root == null) {
            System.out.println("Data tree masih kosong");
            System.out.println("Silahkan isi data tree terlebih dahulu...");
            return -1;
        } else {
            Node24 current = root;
            while (current.right != null) {
                current = current.right;
            }
            return current.data;
        }
    }

    //NOMER 3
    public void printLeafNodes() {
        printLeafNodesRekursif(root);
    }

    private void printLeafNodesRekursif(Node24 nd) {
        if (nd != null) {
            if (nd.left == null && nd.right == null) {
                System.out.print(nd.data + " ");
            }
            printLeafNodesRekursif(nd.left);
            printLeafNodesRekursif(nd.right);
        }
    }

    //NOMER 4
    public int hitungNode() {
        return hitungNodeLeaf(root);
    }

    private int hitungNodeLeaf(Node24 nd) {
        if (nd == null) {
            return 0;
        }  else if (nd.left == null && nd.right == null) {
            return 1;
        } 

        return hitungNodeLeaf(nd.left) + hitungNodeLeaf(nd.right);
    }
}