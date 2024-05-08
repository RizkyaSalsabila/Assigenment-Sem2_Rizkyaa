public class SingleLinkedList24 {
    //atribut
    Node24 head, tail;

    SingleLinkedList24() {
        head = tail = null;
    }

    //method cekKosong()
    boolean isEmpty() {
        //pengecekan kondisi
        //1. apakah head == null(kosong) ? iya : tidak
        if (head == null) {
            return true;
        } else {
            return false;
        } 
    }

    void print() {
        //pengecekan kondisi
        //1. apakah kosong ? iya -> tampilkan perintah linked list masih kosong
        //2.                 tidak -> lakukan perulangan menggunakan while
        //3.                          (
        //4.                           inisialisasi temp bertipe Node = head
        //5.                           kondisi temp != null -> cetak temp.data
        //6.                           iterasi temp = temp.next
        //7.                          )              
        if (isEmpty()) {
            System.out.println("== Linked List masih kosong ==");
        } else {
            Node24 temp = head;
            System.out.println("== Isi Linked List ==");
            while (temp != null) {
                System.out.println(temp.data + "\t");
                temp = temp.next;
            } 
            System.out.println("");
        }
    }

    //method tambah di awal membutuhkan satu parameter input bertipe int
    void addFirst(int input) {
        //1. inisialisasi objek ndInput bertipe Node yang berkonstruktor parameter
        //2. pengecekan kondisi
        //3. apakah data kosong ? iya -> letakkan posisi ndInput di head dan tail yang sama
        //4.                      tidak -> letakkan ndInput di head
        Node24 ndInput = new Node24(input, null);   //bukan konstruktor default, tetapi konstruktor berparameter
        if (isEmpty()) {
            head = tail = ndInput;  //posisi tail bukan di selanjutnya, tetapi posisi tail = head
        } else {    //bukan posisi tail = head, tetapi posisi head di selanjutnya 
            ndInput.next = head;
            head = ndInput;
        }
    }

    //method tambah di akhir membutuhkan satu parameter input bertipe int
    void addLast(int input) {
        //1. inisialisasi objek ndInput bertipe Node yang berkonstruktor parameter
        //2. pengecekan kondisi
        //3. apakah data kosong ? iya -> letakkan posisi ndInput di head dan tail yang sama
        //4.                      tidak -> letakkan ndInput di tail
        Node24 ndInput = new Node24(input, null);   //bukan konstruktor default, tetapi konstruktor berparameter
        if(isEmpty()) {
            head = tail = ndInput;  //posisi tail bukan di selanjutnya, tetapi posisi tail = head
        } else {    //bukan posisi tail = head, tetapi posisi tail di selanjutnya 
            tail.next = ndInput;    
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node24 ndInput = new Node24(input, null);
        Node24 temp = head;
        do {
            if(temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) {  //bukan .next != null, tetapi .next == null
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);     //bukan temp == null, tetapi temp != null
    }

    void insertAt(int index, int input) {
        if (index < 0) {    //bukan > 0, tetapi < 0
            System.out.println("Perbaiki logikanya! Kalau indeksnya negatif bagaimana???");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;
            for (int i = 0; i < index - 1; i++) {   //bukan i < index, tetapi i < index - 1
                temp = temp.next;
            }
            temp.next = new Node24(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
