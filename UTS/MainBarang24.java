import java.util.Scanner;
public class MainBarang24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);
        Proses24 listBarang = new Proses24();
        Barang24 brg1 = new Barang24(16030927, "Indomilk", "Drink", 15000, 100);
        Barang24 brg2 = new Barang24(16030927, "Sprite", "Drink", 7000, 0);
        Barang24 brg3 = new Barang24(16030927, "Yakult", "Drink", 9000, 500);
        Barang24 brg4 = new Barang24(16030927, "Indomie", "Food", 3500, 0);
        Barang24 brg5 = new Barang24(16030927, "Oreo", "Food", 12000, 0);

        //soal nomer 1
        //objek.method
        listBarang.tambah(brg1);
        listBarang.tambah(brg2);
        listBarang.tambah(brg3);
        listBarang.tambah(brg4);
        listBarang.tambah(brg5);

        //soal nomer 2
        System.out.println("===============================");
        System.out.println("Data Barang sebelum sorting : ");
        listBarang.tampil();

        //soal nomer 3
        System.out.println("\n\n===============================");
        System.out.println("Data Barang setelah sorting menaik berdasarkan stok");
        listBarang.bubbleSort();
        listBarang.tampil();

        //soal nomer 4
        System.out.println("\n\n===============================");
        System.out.println("Menampilkan Data yang tergolong makanan dan tidak memiliki stok");
        listBarang.tampilBarangFilter();

        //soal nomer 5
        System.out.println("\n\n===============================");
        System.out.println("Pencarian Data menggunakan 'Sequential Search\n");
        System.out.println("Masukkan Nama Barang yang dicari ");
        System.out.print("\tNama Barang : ");
        String cari = input24.nextLine();
        int posisi = listBarang.findSeqSearchNama(cari);
        listBarang.tampilPosisi(cari, posisi);

        //soal nomer 6
        System.out.println("\n\n===============================");
        System.out.print("Masukkan nama barang untuk penambahan stok : ");
        String nama = input24.nextLine();
        System.out.print("Masukkan jumlah stok : ");
        int stok = input24.nextInt();
        input24.nextLine();
        listBarang.tambahStok(nama, stok);

        //soal nomer 7
        System.out.println("\n\n===============================");
        System.out.print("Masukkan nama barang untuk penambahan stok : ");
        String nm = input24.nextLine();
        System.out.print("Masukkan jumlah stok : ");
        int stk = input24.nextInt();
        input24.nextLine();
        listBarang.kurangiStok(nama, stok);

        input24.close();
    }
}