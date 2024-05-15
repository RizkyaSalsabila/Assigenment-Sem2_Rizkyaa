public class DoubleLinkedList24 {
    //atribut
    Node24 head;
    int size;

    //buat konstruktor class DoubleLinkedList24
    public DoubleLinkedList24() {
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

    //method untuk menambahkan data pada bagian awal 'addFirst'
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node24(null, item, null);
        } else {
            Node24 nodeBaru = new Node24(null, item, head);
            head.prev = nodeBaru;
            head = nodeBaru;
        }
        size++;
    }

    //method untuk menambahkan data pada bagian akhir 'addLast'
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node24 nodeBaru = new Node24(current, item, null);
            current.next = nodeBaru;
            size++;
        }
    }

    //method untuk menambahkan data pada indeks tertentu 'add'
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node24 nodeBaru = new Node24(null, item, current);
                current.prev = nodeBaru;
                head = nodeBaru;
            } else {
                Node24 nodeBaru = new Node24(null, item, null);
                nodeBaru.prev = current.prev;
                nodeBaru.next = current;
                current.prev.next = nodeBaru;
                current.prev = nodeBaru;
            }
        }
        size++;
    }

    //method untuk mengetahui nilai size saat ini 'size'
    public int size() {
        return size;
    }

    //method untuk menghapus semua isi data 'clear'
    public void clear() {
        head = null;
        size = 0;
    }
    
    //method untuk mencetak semua isi data linked lists 'print'
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked lists masih kosong");
        } else {
            Node24 temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\n\nData berhasil diisi ^-^");
        }
    }
}