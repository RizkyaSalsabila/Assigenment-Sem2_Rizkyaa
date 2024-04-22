package Praktikum1;

class Queue24 {
    //atribut
    int data[];
    int front;
    int rear;
    int size;
    int max;

    //konstruktor berparameter
    public Queue24(int n) {
        max = n;
        data = new int[n];
        size = 0;
        front = rear = -1;
    }

    //untuk mengecek apakah queue sudah penuh
    public boolean isFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    //untuk mengecek apakah queue kosong
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //untuk menampilkan elemen queue pada posisi paling depan
    public void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen depan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //untuk menampilkan seluruh elemen pada queue
    public void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen : " + size);
        }
    }

    //untuk menghapus semua elemen pada queue
    public void clear() {
        if(!isEmpty()) {
            front = rear - 1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // untuk menambahkan isi queue 'parameter dt yang bertipe integer'
    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Data sudah penuh");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if(rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
         }
    }

    //untuk mengeluarkan data pada queue di posisi belakang
    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
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
}