import java.util.Scanner;
public class BukuMain24 {
    public static void main(String[] args) {

    //Deklarasi Scanner
    Scanner input24 = new Scanner(System.in);

    PencarianBuku24 data = new PencarianBuku24();
    int jmlBuku = 5;

    System.out.println("---------------------------------");
    System.out.println("Masukkan Data Buku secara urut dari Kode Buku Terkecil : ");
    for (int i = 0; i < jmlBuku; i++) {
        System.out.println("=======================");
        System.out.print("Kode Buku : ");
        String kodeBuku = input24.nextLine();
        System.out.print("Judul Buku : ");
        String judulBuku = input24.nextLine();
        System.out.print("Tahun Terbit : ");
        int tahunTerbit = input24.nextInt();
        input24.nextLine();
        System.out.print("Pengarang : ");
        String pengarang = input24.nextLine();
        System.out.print("Stock : ");
        int stock = input24.nextInt();
        input24.nextLine();

        Buku24 m = new Buku24(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
    }

    System.out.println("-------------------------------\n");
    System.out.println("Data Keseluruhan Buku : ");
    data.tampil();

    System.out.println("----------------------------\n");
    System.out.println("----------------------------");
    System.out.println("Pencarian Data\n");
    System.out.println("Masukkan Kode Buku yang dicari ");
    System.out.print("\tKode Buku : ");
    String cari = input24.nextLine();

    System.out.println("\nPencarian dilakukan menggunakan 'Sequential Search'");
    int posisi = data.findSeqSearch(cari);
    data.tampilPosisi(cari, posisi);
    data.tampilData(cari, posisi);

    //Penambahan no 3
    System.out.println("Menggunakan Metode FIND BUKU");
    Buku24 dataBuku24 = data.findBuku(cari);
    if (dataBuku24 != null) {
        dataBuku24.tampilDataBuku();
    } else {
        System.out.println("Buku tidak ditemukan");
    }

    //Percobaan 2
    System.out.println("----------------------------");
    System.out.println("Menggunakan BINARY SEARCH");
    posisi = data.FindBinarySearch(cari, 0, jmlBuku - 1);
    data.tampilPosisi(cari, posisi);
    data.tampilData(cari, posisi);

    input24.close();
    }
}