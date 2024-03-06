package KUIZ;

public class Mobil24 {
    //Atribut
    String nama;
    int cc;
    int hargaBeli;
    int thnProduksi;

    //Konstruktor default
    public Mobil24() {

    }

    //Konstruktor berparameter
    public Mobil24(String nm, int cc, int hBeli, int tProduksi) {
        nama = nm;
        this.cc = cc;
        hargaBeli = hBeli;
        thnProduksi = tProduksi;
    }

    //method hitungPajak
    public double hitungPajak() {
        double pajak = 0;
        if (cc > 1500) {
            pajak = 0.1 * hargaBeli;
        } else {
            pajak = 0.075 * hargaBeli;
        }
        return pajak;
    }

    //method hitungBiayaPerawatan
    public double hitungBiayaPerawatan() {
        double biayaPerawatan = 0;
        if (thnProduksi < 2010) {
            biayaPerawatan = 0.8 * hargaBeli;
        } else {
            biayaPerawatan = 0.5 * hargaBeli;
        }
        return biayaPerawatan * hargaBeli; 
    }

    //method hitungBiayaTotal
    public double hitungBiayaTotal() {
        double biayaTotal = 0;
        biayaTotal = hitungPajak() + hitungBiayaPerawatan();
        
        return biayaTotal;
    }

    //method printData
    void printData() {
        System.out.println("Nama Mobil : " + nama);
        System.out.println("Cc Mobil : " + cc);
        System.out.println("Harga Beli : " + hargaBeli);
        System.out.println("Tahun Produksi : " + thnProduksi);
    }
}


