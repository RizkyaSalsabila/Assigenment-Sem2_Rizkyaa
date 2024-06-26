package Tugas_2;

public class AntrianFilm24 {
    //atribut
    Film24[] data;
    Node24 head;
    int size;

     //konstruktor default
     public AntrianFilm24() {
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

    //NOMER 1
    //method untuk menambahkan data pada bagian awal 'tambahAwal'
    public void tambahAwal(Film24 dt) {
        if (isEmpty()) {
            head = new Node24(null, dt, null);
        } else {
            Node24 nodeBaru = new Node24(null, dt, head);
            head.prev = nodeBaru;
            head = nodeBaru;
        }
        size++;
    }

    //NOMER 2
    //method untuk menambahkan data pada bagian akhir 'tambahAkhir'
    public void tambahAkhir(Film24 dt) {
        if (isEmpty()) {
            tambahAwal(dt);
        } else {
            Node24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node24 nodeBaru = new Node24(current, dt, null);
            current.next = nodeBaru;
            size++;
        }
    }

    //NOMER 3
    //method untuk menambahkan data pada indeks tertentu 'tambahData'
    public void tambahData(Film24 dt, int index) throws Exception {
        if (isEmpty()) {
            tambahAwal(dt);
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
                Node24 nodeBaru = new Node24(null, dt, current);
                current.prev = nodeBaru;
                head = nodeBaru;
            } else {
                Node24 nodeBaru = new Node24(null, dt, null);
                nodeBaru.prev = current.prev;
                nodeBaru.next = current;
                current.prev.next = nodeBaru;
                current.prev = nodeBaru;
            }
        }
        size++;
    }

    //NOMER 4
    //method untuk menghapus pada data yang di awal 'hapusPertama'
    public void hapusPertama() throws Exception{
        if (isEmpty()) {
            throw new Exception("Data Film masih kosong, data tidak dapat dihapus !!");
        } else if (size == 1) {
            hapusAkhir();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        System.out.println("Data Awal berhasil dihapus");
        System.out.println("Silahkan cetak ulang untuk melihat data terupdate...");
    }

    //NOMER 5
    //method untuk menghapus pada data yang di akhir 'hapusAkhir'
    public void hapusAkhir() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Film masih kosong, data tidak dapat dihapus !!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node24 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;

        System.out.println("Data Akhir berhasil dihapus");
        System.out.println("Silahkan cetak ulang untuk melihat data terupdate...");
    }

    //NOMER 6
    //method untuk menghapus pada data sesuai indeks tertentu 'hapusData'
    public void hapusData(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("KESALAHAN!! Nilai indeks yang diinput di luar batas");
        } else if (index == 0) {
            hapusPertama();
        } else {
            Node24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
                System.out.println("Data dengan indeks " + index + " berhasil dihapus");
                System.out.println("Silahkan cetak ulang untuk melihat data terupdate...");
                break;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    //NOMER 7
    //method untuk mencetak data 'cetak'
    public void cetak() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            Node24 current = head;
            while (current != null) {
                for(int i = 0; i < size; i++) {
                    System.out.println("\nData Film ke -" + (i+1));
                    System.out.println("ID      : " + current.data.id_film);
                    System.out.println("Judul   : " + current.data.judul);
                    System.out.println("IPK     : " + current.data.rating_ipk);
                    current = current.next;
                }
                System.out.println("");
            }
            System.out.println("Total Data Film : " + size);
        }
    }

    //NOMER 8
    //method untuk mencari data berdasarkan id_film 'cariFilm'
    public Film24 carFilm(int id) throws Exception {
        if (isEmpty() || size == 0) {
            throw new Exception("Data Film masih kosong");
        } else {
            Node24 temp = head;
            while (temp != null) {
                if (temp.data.id_film == id) {
                    System.out.println("Data Berhasil Ditemukan");
                    System.out.println("ID    : " + temp.data.id_film);
                    System.out.println("Judul : " + temp.data.judul);
                    System.out.println("IPK   : " + temp.data.rating_ipk);
                    return temp.data;
                }
                temp = temp.next;
                break;
            }
            System.out.println("Data id " + id + " tidak dapat ditemukan");
            return null;
        }
    }

    //NOMER 9
    //method mengurutkan data DESC bubbleSort 'urutData'
    public void urutData() {
        if (isEmpty()) {
            System.out.println("Data Film masih kosong");
            System.out.println("Silahkan tambah data terlebih dahulu...");
        } else {
            System.out.println("\nHasil Pengurutan Data");
            for (int i = 0; i < size - 1; i++) {
                Node24 current = head;
                for (int j = 1; j< size - 1; j++) {
                    //proses penukaran
                    Film24 tmp = current.data;
                    current.data = current.next.data;
                    current.next.data = tmp;
                }
                current = current.next;
            }
        }
        cetak();
    }
}