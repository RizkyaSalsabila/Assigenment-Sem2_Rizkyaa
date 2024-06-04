package Tugas_1;

public class SLL24 {
    //atribut
    NodeTugas24 head, tail;
    int size;

    //konstruktor default
    SLL24() {
        head = tail = null;
        size = 0;
    }

    //method untuk menngecek kosong
    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    //method untuk mencetak 'print'
    public void print() {
        if (isEmpty()) {
            System.out.println("== Linked List Mahasiswa masih kosong ==");
        } else {
            NodeTugas24 temp = head;
            System.out.println("== Isi Linked List ==");
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }

    //method untuk menambah data posisi awal 'addFirst'
    public void addFirst(MahasiswaSLL24 mhs) {
        NodeTugas24 nodeBaru = new NodeTugas24(mhs, null);
        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            nodeBaru.next = head;
            head = nodeBaru;
        }
        size++;
    }

    //method untuk menambahkan data posisi akhir 'addLast'
    public void addLast(MahasiswaSLL24 mhs) {
        NodeTugas24 nodeBaru = new NodeTugas24(mhs, null);
        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        size++;
    }

    //method untuk menambah data di indeks/key setelahnya
    public void insertAfter(String afterNim, MahasiswaSLL24 mhs) {
        if (isEmpty()) {
            addFirst(mhs);
        } else {
            NodeTugas24 nodeBaru = new NodeTugas24(mhs, null);
            NodeTugas24 temp = head;
            while (temp != null) {
                if (temp.data.nim.equalsIgnoreCase(afterNim)) {
                    nodeBaru.next = temp.next;
                    temp.next = nodeBaru;
                    if (nodeBaru.next == null) {
                        tail = nodeBaru;
                    }
                    size++;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    //method untuk menambah data pada indeks tertentu
    public void insertAt(int index, MahasiswaSLL24 mhs) {
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Kalau indeksnya negatif bagaimana???");
        }
        else if (isEmpty() || index == 0) {
            addFirst(mhs);
        } else if (index == size) {
            addLast(mhs);
        } else {
            NodeTugas24 temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            NodeTugas24 nodeBaru = new NodeTugas24(mhs, temp.next);
            //nodeBaru.next = temp.next;
            temp.next = nodeBaru;
            if (temp.next.next == null) {
                tail = temp.next;
            }
            size++;
        }
    }
}