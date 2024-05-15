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

    //method untuk menampilkan
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
        }
    }

    //method tambah di awal membutuhkan satu parameter input bertipe int
    void addFirst(int input) {
        //1. inisialisasi objek ndInput bertipe Node yang berkonstruktor parameter
        //2. pengecekan kondisi
        //3. apakah data kosong ? iya -> letakkan posisi ndInput di head dan tail yang sama
        //4.                      tidak -> sambungkan terlebih dahulu ndInput(pointer next) ke head,
        //5.                               setelah itu posisikan head ke ndInput yang baru
        Node24 ndInput = new Node24(input, null);   //*bukan konstruktor default, tetapi konstruktor berparameter
        if (isEmpty()) {
            head = tail = ndInput;  //*posisi tail bukan di selanjutnya, tetapi posisi tail = head
        } else {    //*bukan posisi tail = head, tetapi posisi head di selanjutnya 
            ndInput.next = head;
            head = ndInput;
        }
    }

    //method tambah di akhir membutuhkan satu parameter input bertipe int
    void addLast(int input) {
        //1. inisialisasi objek ndInput bertipe Node yang berkonstruktor parameter
        //2. pengecekan kondisi
        //3. apakah data kosong ? iya -> letakkan posisi ndInput di head dan tail yang sama
        //4.                      tidak -> sambungkan tail (pointer next) ke ndInput yang baru,
        //5.                               setelah itu pindahkan posisi tail ke ndInput yang baru
        Node24 ndInput = new Node24(input, null);   //*bukan konstruktor default, tetapi konstruktor berparameter
        if(isEmpty()) {
            head = tail = ndInput;  //*posisi tail bukan di selanjutnya, tetapi posisi tail = head
        } else {    //*bukan posisi tail = head, tetapi posisi tail di selanjutnya 
            tail.next = ndInput;    
            tail = ndInput;
        }
    }

    //method untuk menambah di indeks/key setelahnya
    void insertAfter(int key, int input) {
        //1. inisialisasi objek ndInput bertipe Node yang berkonstruktor parameter
        //2. buat variabel temp bertipe objek Node, dan posisikan = head
        //3. lakukan perulangan do while, dengan kondisi temp akan terus berulang jika != null
        //4.    pengecekan kondisi, 
        //5.               apakah data yang diinput == key? iya -> sambungkan temp(pointer next) ke ndInput yang baru,
        //6.                                                       jika ndInput(pointer next) kosong, 
        //7.                                                            maka posisikan tail di ndInput yang baru, 
        //8.                                                                 kemudian break
        //9.                                                tidak -> lakukan perulangan ke temp.next 
        //10.                                                        sampai menemukan kondisi data == key
        Node24 ndInput = new Node24(input, null);
        Node24 temp = head;
        do {
            if(temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) {  //*bukan .next != null, tetapi .next == null
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);     //*bukan temp == null, tetapi temp != null
    }

    //method untuk menambah data di indeks tertentu
    void insertAt(int index, int input) {
        //1. lakukan pengecekan kondisi
        //2. apakah indeks < 0? iya -> tampilkan kesalahan
        //3.                    tidak -> apakah indeks == 0? iya -> panggil method addFirst 
        //4.                                                        'otomatis ndInput yang baru berada 
        //5.                                                         pada head dan tail awal'
        //6.                                                 tidak -> posisikan temp = head
        //7.                                                          lakukan perulangan menggunakan for, 
        //8.                                                                kemudian posisikan temp ke temp.next
        //9.                                                          diluar perulangan, jika temp.next.next berisi null,
        //10.                                                                             maka temp.next menjadi tail
        if (index < 0) {    //*bukan > 0, tetapi < 0
            System.out.println("Perbaiki logikanya! Kalau indeksnya negatif bagaimana???");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;
            for (int i = 0; i < index - 1; i++) {   //*bukan i < index, tetapi i < index - 1
                temp = temp.next;
            }
            temp.next = new Node24(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    //PENAMBAHAN PERCOBAAN2
    //method untuk memanggil data yang diinginkan berdasarkan indeks 'getData'
    int getData(int index) {
        //1. posisikan temp = head
        //2. lakukan perulangan menggunakan for, dimulai dari 0 
        //3.                                        perulangan akan berhenti dengan kondisi kurang dari indeks 
        //4.                                            akan melakukan iterasi penambahan+1 setiap perulangan
        //5.                                                jika kondisi memenuhi, hubungkan temp ke temp.next setiap perulangan
        //6.                                     return temp.data sesuai indeks yang dimasukkan
        Node24 tmp = head;
        for (int i = 0; i < index; i++) {   //*bukan i < index + 1, tetapi i < index 
            tmp = tmp.next;
        }
        return tmp.data;   //*bukan tmp.next.data, tetapi tmp.data;
    }

    //method untuk mengetahui posisi data pada indeks ke berapa 'indexOf'
    int indexOf(int key) {
        //1. posisikan tmp = head
        //2. lakukan perulangan menggunakan while,
        //3.    dengan index nilai awal 0
        //4.        dengan kondisi apakah tmp != null && apakah tmp.data != key
        //5.            jika iya, hubungkan tmp ke tmp.next, dan lakukan penambahan+1 setiap perulangan
        //6. apakah kondisi tmp == kosong? iya -> return -1
        //7.                               tidak -> return index sesuai data yang diinput
        Node24 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if(tmp == null) { //==
            return -1; //-1
        } else {
            return index;
        }
    }
    
    //method untuk menghapus pada data yang paling awal 'removeFirst'
    void removeFirst() {
        //1. pengecekan kondisi
        //2. apakah data kosong? iya -> tampilkan keterangan
        //3.                     tidak -> apakah posisi head == tail? iya -> maka head = tail == null/kosong
        //4.                                                          tidak -> pindah posisi head ke head.next
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    //method untuk menghapus pada data yang paling akhir 'removeLast'
    void removeLast() {
        //1. pengecekan kondisi
        //2. apakah data kosong? iya -> tampilkan keterangan
        //3.                     tidak -> apakah posisi head == tail? iya -> maka head = tail == null/kosong
        //4.                                                          tidak -> posisikan temp = head
        //5.                                                                   lakukan perulangan menggunakan while,
        //6.                                                                       dengan kondisi jika temp.next.next tidak kosong
        //7.                                                                       maka hubungkan temp ke temp.next
        //8.                                                                   jika kondisi temp.next kosong, maka posisikan temp sebagai tail
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) { //ganti ==
            head = tail = null;
        } else {
            Node24 temp = head;
            while (temp.next.next != null) { //.next
                temp = temp.next;
            }
            temp.next = null;
            tail = temp; //hapus .next
        }
    }

    //method untuk mengahpus data tertentu menggunakan 'remove'
    void remove(int key) {
        //1. pengecekan kondisi
        //2. apakah data kosong? iya -> tampilkan keterangan
        //3.                     tidak -> posisikan temp = head
        //4.                              lakukan perulangan menggunakan while
        //5.                                   dengan kondisi temp tidak kosong (!= null), lalu hubungkan setiap perulangan ke temp.next
        //6.                                     lakukan pengecekan kondisi, apakah data yang mau dihapus == key yang dimasukkan 
        //7.                                        AND 
        //8.                                          apakah temp di posisi head? iya -> panggil method removeFirst, kemudian break
        //9.                                                                      tidak -> apakah temp.next.data == key yang dimasukkan?
        //10.                                                                              iya-> hubungkan temp.next ke temp.next.next, kemudian break
        //11.                                                                                     namun jika temp.next == kosong, maka posisikan sbg tail
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            Node24 temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) { //==
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    //method untuk menghapus berdasarkan indeks
    void removeAt(int index) {
        //1. apakah indeks yang ingin dihapus == 0? iya -> panggil method removeFirst
        //2.                                        tidak -> posisikan temp = head
        //3.                                                   lakukan perulangan menggunakan for, dimulai dari 0 
        //4.                                                      perulangan akan berhenti dengan kondisi indeks - 1  
        //5.                                                          akan melakukan iterasi penambahan+1 setiap perulangan
        //6.                                                             jika kondisi memenuhi, hubungkan temp ke temp.next setiap perulangan
        //7.                                                   hubungkan temp.next ke temp.next.next, sebelum penghapusan pada indeks tertentu
        //8.                                                   jika temp.next == null, maka posisikan temp sebagai tail
        if (index == 0) {
            removeFirst();
        } else {
            Node24 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
