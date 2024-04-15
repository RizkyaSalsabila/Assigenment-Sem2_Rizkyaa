import java.util.Scanner;

public class Utama24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan data kapasitas : ");
        int input = scanner.nextInt();

        //Instansiasi Gudang
        Gudang24 gudang = new Gudang24(input);

        while(true) {
            System.out.println("\n------------------------------");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Kode Barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan Nama Barang : ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan Nama Kategori : ");
                    String kategori = scanner.nextLine();
                    System.out.println("========================");

                    //Untuk menyimpan hasil Barang
                    Barang24 barangBaru = new Barang24(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2: 
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Coba Lagi...");
            }
        } 
    }
}