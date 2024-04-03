public class Buku24 {
    //Atribut
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    //Konstruktor berparameter
    public Buku24(int KB, String JB, int TT, String P, int S) {
        kodeBuku = KB;
        judulBuku = JB;
        tahunTerbit = TT;
        pengarang = P;
        stock = S;
    }

    //Method tampilDataBuku() 
    public void tampilDataBuku() {
        System.out.println("-----------------------");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stok : " + stock);
    }
 }