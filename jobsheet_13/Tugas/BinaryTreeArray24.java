package Tugas;

public class BinaryTreeArray24 {
    //atribut
    int[] data;
    int idxLast;
    //atribut
    Node24 root;

    //Konstruktor default
    public BinaryTreeArray24() {
        data = new int[10];
    }

    //method untuk mengisi elemen data tree dan mengatur nilai idxLast 'populateDate'
    void populateDate(int dt[], int idxL) {
        data = dt;
        idxLast = idxL;
    }

    //NOMER 5
    //method untuk memasukkan data kedalam tree 'add'
    public void add(int dt) {
        if (idxLast + 1 < data.length) {
            data[idxLast++] = dt;
        } else {
            System.out.println("Tree sudah penuh...");
        }
    }

    //method untuk menstranverse posisi parent di tengah 'tranverseInOrder'
    void tranverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            tranverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            tranverseInOrder(2*idxStart + 2);
        }
    }

    //method untuk menstranverse posisi parent di awal 'tranversePreOrder'
    void tranversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            tranverseInOrder(2*idxStart+1);
            tranverseInOrder(2*idxStart + 2);
        }
    }

    //method untuk menstranverse posisi parent di akhir 'tranversePostOrder'
    void tranversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            tranverseInOrder(2*idxStart+1);
            tranverseInOrder(2*idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }

}