package Tugas_1;

public class AntrianVaksinasi24 {
    //atribut
    Orang24[] data;
    Node24 head;
    int size;

    //konstruktor default
    public AntrianVaksinasi24() {
        head = null;
        size = 0;
    }

    //method untuk mengecek kosong
    public boolean isEmpty() {
        if(head == null && size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //method untuk mengetahui nilai size saat ini 'size'
    public int size() {
        return size;
    }

    public void tambahData(Orang24 dt) {
        if (isEmpty()) {
            head = new Node24(null, dt, null);
        } else {
            Node24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node24 nodeBaru = new Node24(current, dt, null);
            current.next = nodeBaru;
        }
        size++;
    }

    public Orang24 hapusData() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return null;
        } else {
            Orang24 dt = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return dt;
        }
    }

    public void cetak() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            Node24 current = head;
            while (current != null) {
                System.out.println("No : " + current.data.no + ", nama : " + current.data.nama);
                current = current.next;
            }
            System.out.println("Sisa Antrian : " + size);
        }
    }
}