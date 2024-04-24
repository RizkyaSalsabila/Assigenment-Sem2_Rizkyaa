public class Barang24 {
    //atribut barang
    int kodeBarang;
    String nama;
    String kategori;
    double hargaSatuan;
    int stok;

    //konstruktor berparameter
    Barang24(int kd, String nm, String ktgr, double hg, int stok) {
        kodeBarang = kd;
        nama = nm;
        kategori = ktgr;
        hargaSatuan = hg;
        this.stok = stok;
    }

    void tampil() {
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama : " + nama);
        System.out.println("Kategori : " + kategori);
        System.out.println("Harga Satuan : " + hargaSatuan);
        System.out.println("Stok : " + stok);
    }
}