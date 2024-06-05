package Tugas_2;

public class SLL_Queue24 {
    //atribut
    NodeTugas2_24 front;
    NodeTugas2_24 rear;

    //Konstruktor awal 'inisialisasi kosong'
    SLL_Queue24() {
        front = rear = null;
    }

    //method untuk mengecek kosong
    boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    //method untuk mencetak data di Queue 'print'
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong ...");
        } else {
            NodeTugas2_24 current = front;
            while (current != null) {
                System.out.println("NIM : " + current.data.nim + ", Nama : " + current.data.nama);
                current = current.next;
            }
        }
    }

    //method untuk menambah data antrian belakang 'enqueue'
    public void enqueue(MahasiswaQueueSLL24 mhs) {
        NodeTugas2_24 nodeBaru = new NodeTugas2_24(mhs, null);
        if (isEmpty()) {
            front = rear = nodeBaru;
            return;
        } else {
            rear.next = nodeBaru;
            rear = nodeBaru;
        }
    }

    //method untuk menghapus data antrian depan 'dequeue'
    public NodeTugas2_24 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong !!!");
        } 
        NodeTugas2_24 temp = front;
        front = front.next;
        System.out.println("Data berhasil dihapus !!!");
        return temp;
    }

    //method untuk mengecek data antrian terdepan 'peek'
    public NodeTugas2_24 peek() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong !!!");
        } 
        return front;
    }
}