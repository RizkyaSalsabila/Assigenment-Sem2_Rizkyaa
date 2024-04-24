package Praktikum2;

public class QueueNasabah24 {
    Nasabah24[] data;
    int front;
    int rear;
    int size;
    int max;

    //konstruktor berparameter
    public QueueNasabah24(int n) {
        //1. Deklarasikan max = banyaknya n
        //2. banyaknya data = banyaknya max
        //3. setting size = 0
        //4. posisi front = posisi rear == -1
        max = n;
        data = new Nasabah24[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        //Jika ukuran == max, iya : tidak
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        //jika size == 0, iya : tidak
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        //pengecekan kondisi
        //1. jika kosong, iya -> maka muncul perintah data masih kosong
        //2.              tidak - > muncul perintah data terdepan "data[front]"
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen terdepan");
            System.out.println("No Rekening : " + data[front].norek);
            System.out.println("Nama : " + data[front].nama);
            System.out.println("Alamat : " + data[front].alamat);
            System.out.println("Umur : " + data[front].umur);
            System.out.println("Saldo : " + data[front].saldo);
        }
    }

    public void print() {
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
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear) {
                System.out.println("\nNo Rekening : " + data[i].norek);
                System.out.println("Nama : " + data[i].nama);
                System.out.println("Alamat : " + data[i].alamat);
                System.out.println("Umur : " + data[i].umur);
                System.out.println("Saldo : " + data[i].saldo);
                System.out.println("\nJumlah elemen " + size);
                i = (i + 1) % max;
            } 
            System.out.println("\nNo Rekening : " + data[i].norek);
            System.out.println("Nama : " + data[i].nama);
            System.out.println("Alamat : " + data[i].alamat);
            System.out.println("Umur : " + data[i].umur);
            System.out.println("Saldo : " + data[i].saldo);
            System.out.println("Jumlah elemen " + size);
        }
    }

    //menambahkan data memakai enqueue
    public void enqueue(Nasabah24 dt) {
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
            System.out.println("Queue sudah penuh");
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
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah24 dequeue() {
        //1. inisialisasi dt
        //2. pengecekan kondisi --> apakah kosong? iya -> queue masih kosong
        //3.                                       tidak -> posisikan dt = data[front]
        //4.                                                ukuran size berkurang
        //5.                                                pengecekan kondisi --> apakah kosong? iya -> posisi front = rear = -1
        //6.                                                                                      tidak -> pengecekan kondisi --> apakah front = max - 1? iya -> posisi front = 0
        //7.                                                                                                                                              tidak - > posisi fornt bertambah 
        //8.                                       return dt
        Nasabah24 dt = new Nasabah24();
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
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

    public void peekRear() {
        //pengecekan kondisi
        //1. jika kosong, iya -> maka muncul perintah data masih kosong
        //2.              tidak - > muncul perintah data terbelakang "data[rear]"
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen terbelakang ");
            System.out.println("Nomer Rekening : " + data[rear].norek);
            System.out.println("Nama : " + data[rear].nama);
            System.out.println("Alamat : " + data[rear].alamat);
            System.out.println("Umur : " + data[rear].umur);
            System.out.println("Saldo : " + data[rear].saldo);
        }
    }
}