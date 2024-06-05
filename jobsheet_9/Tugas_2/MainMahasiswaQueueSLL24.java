package Tugas_2;

public class MainMahasiswaQueueSLL24 {
    public static void main(String[] args) {
        SLL_Queue24 mhs = new SLL_Queue24();

        //tambah data
        System.out.println("--------------------------");
        System.out.println("Daftar Antrian Keseluruhan : ");
        mhs.enqueue(new MahasiswaQueueSLL24("111", "Anton"));
        mhs.enqueue(new MahasiswaQueueSLL24("112", "Prita"));
        mhs.enqueue(new MahasiswaQueueSLL24("113", "Yusuf"));
        mhs.enqueue(new MahasiswaQueueSLL24("114", "Doni"));
        mhs.enqueue(new MahasiswaQueueSLL24("115", "Sari"));
        
        //cetak
        mhs.print();

        //lihat elemen depan
        mhs.peek();
        System.out.println("\n--------------------------");
        System.out.println("Antrian terdepan : ");
        System.out.println("NIM : " + mhs.front.data.nim + ", Nama : " + mhs.front.data.nama);
        
        //hapus elemen
        System.out.println("\n--------------------------");
        System.out.println("Hapus antrian paling depan dengan : ");
        System.out.println("NIM : " + mhs.front.data.nim + ", Nama : " + mhs.front.data.nama);
        mhs.dequeue();

        System.out.println("\n--------------------------");
        System.out.println("Antrian terdepan saat ini : ");
        mhs.peek();
        System.out.println("NIM : " + mhs.front.data.nim + ", Nama : " + mhs.front.data.nama);
    }
}