package Tugas;

public class QueuePembeli24 {
    Pembeli24[] antrian;
    int front;
    int rear;
    int size;
    int max;

    QueuePembeli24(int n) {
        //1. Deklarasikan max = banyaknya n
        //2. banyaknya data = banyaknya max
        //3. setting size = 0
        //4. posisi front = posisi rear == -1
        max = n;
        antrian = new Pembeli24[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        //jika size == 0, iya : tidak
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        //jika size == max, iya : tidak
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(Pembeli24 antri) {
        //pengecekan kondisi
        //1. jika full, iya -> data sudah penuh
        //2.            tidak -> pengecekan kondisi
        //3.                     1. apakah kosong, iya -> posisikan front = rear = 0
        //4.                                       tidak -> pengecekan kondisi
        //5.                                                1. apakah rear = max -1? iya -> rear = 0
        //6.                                                                         tidak -> rear++
        //7.                                       posisikan data[rear] = dt
        //8.                                       posisikan size bertambah
        if(isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if(isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    Pembeli24 dequeue() {
        //1. inisialisasi dt menggunakan tipe data Pembeli24
        //2. pengecekan kondisi --> apakah kosong? iya -> queue masih kosong
        //3.                                       tidak -> posisikan dt = data[front]
        //4.                                                ukuran size berkurang
        //5.                                                pengecekan kondisi --> apakah kosong? iya -> posisi front = rear = -1
        //6.                                                                                      tidak -> pengecekan kondisi --> apakah front = max - 1? iya -> posisi front = 0
        //7.                                                                                                                                              tidak - > posisi front bertambah 
        //8.                                       return dt
        Pembeli24 dt = new Pembeli24();
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if(isEmpty()) {
                front = rear = -1;
            } else {
                if(front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    void print() {
        //pengecekan kondisi
        //1. jika kosong, iya -> maka muncul perintah data masih kosong
        //2.              tidak -> lakukan perulangan 
        //                         (
        //                         1. tetapkan i = front
        //                         2. while kondisi (i != rear), tampilkan data i
        //                         3. iterasi -> i = (i++) % max
        //                         )
        //                       tampilkan "data[i]"
        //                       tampilkan banyaknya jumlah elemen "size"
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while(i != rear) {
                System.out.println("\nNama : " + antrian[i].nama);
                System.out.println("No HP : " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("\nNama : " + antrian[i].nama);
            System.out.println("No HP : " + antrian[i].noHP);
            System.out.println("Jumlah antrian " + size);
        }
    }

    void peek() {
        //pengecekan kondisi
        //1. jika kosong, iya -> maka muncul perintah data masih kosong
        //2.              tidak - > muncul perintah data terdepan "data[front]"
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian Terdepan");
            System.out.println("Nama : " + antrian[front].nama);
            System.out.println("No HP : " + antrian[front].noHP);
        }
    }

    void peekRear() {
         //pengecekan kondisi
        //1. jika kosong, iya -> maka muncul perintah data masih kosong
        //2.              tidak - > muncul perintah data terbelakang "data[rear]"
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian Terbelakang");
            System.out.println("Nama : " + antrian[rear].nama);
            System.out.println("No HP : " + antrian[rear].noHP);
        }
    }

    void peekPosition(String nama) {
        //pengecekan kondisi
        //1. apakah kosong ? iya -> maka muncul perintah data masih kosong
        //2.                 tidak -> lakukan perulangan 
        //                         (
        //                         1. tetapkan posisi = front
        //                         2. while kondisi (posisi != rear), tampilkan data berupa nama dan posisi indeks
        //                         3. iterasi -> posisi = (posisi + 1) % max
        //                         )
        //3. apakah nama yang dicari == posisi nama di belakang ? iya -> tampilkan data nama pembeli
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int posisi = front;
            while (posisi != rear) {
                if (antrian[posisi].nama.equals(nama)) {
                    System.out.println("Pembeli " + nama + " berada pada posisi depan di indeks ke - " + posisi + 1);
                    return;
                }
                posisi = (posisi + 1) % max;
            }
            if (antrian[rear].nama.equals(nama)) {
                System.out.println("Pembeli " + nama + " berada pada posisi belakang");
            }
        }
    }

    void daftarPembeli() {
        //pengecekan kondisi
        //1. apakah data masih kosong ? iya -> maka muncul perintah data masih kosong
        //2.                            tidak -> lakukan perulangan 
            //                         (
            //                         1. tetapkan i = front
            //                         2. while kondisi (i != rear), tampilkan data berupa nama dan no HP
            //                         3. iterasi -> posisi = (posisi + 1) % max
            //                         )
            //                         tampilkan data nama dan no HP paling belakang
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("\nNama : " + antrian[i].nama);
                System.out.println("No HP : " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("\nNama : " + antrian[rear].nama);
            System.out.println("No HP : " + antrian[rear].noHP);
        }
    }
}