package QUIZ;
public class Mobil24 {
    //Atribut
    String nama;
    int cc, hargaBeli, thnProduksi;

    //Konstruktor berparameter
    Mobil24(String nm, int c, int hrg, int thn) {
        nama = nm;
        cc = c;
        hargaBeli = hrg;
        thnProduksi = thn;
    }
    
    //method hitungPajak
    double hitungPajak() {
        double pajak = 0;
        if (cc > 1500) {
            pajak = hargaBeli * 0.1;
        } else {
            pajak = hargaBeli * 0.075;
        }
        return pajak;
    }

    //method hitungBiayaPerawatan
    double hitungBiayaPerawatan() {
        double perawatan = 0;
        if (thnProduksi < 2010) {
            perawatan = hargaBeli * 0.08;
        } else if(thnProduksi > 2010) {
            perawatan = hargaBeli * 0.05;
        }
        return perawatan;
    }
    
    //method hitungBiayaTotal
    double hitungBiayaTotal() {
        double total = 0;
        total = hitungPajak() + hitungBiayaPerawatan();
        return total;
    }

    //method printData
    void printData() {
        System.out.println("Nama mobil: " + nama);
        System.out.println("CC mobil: " + cc);
        System.out.println("Harga Beli Mobil: " + hargaBeli);
        System.out.println("Tahun Produksi Mobil: " + thnProduksi);
        System.out.println("Pajak Mobil: " + hitungPajak());
        System.out.println("Biaya Perawatan Mobil: " + hitungBiayaPerawatan());
        System.out.println("Total Biaya Mobil: " + hitungBiayaTotal());
        System.out.println();
    }
}