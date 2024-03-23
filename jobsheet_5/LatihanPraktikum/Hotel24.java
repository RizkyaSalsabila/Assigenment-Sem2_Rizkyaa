package LatihanPraktikum;

public class Hotel24 {
    //Atribut
    //tipeData-variabel
    String nama;
    String kota;
    int harga;
    int bintang;

    //Konstruktor berparameter (tipeData inisial var, dst)
    Hotel24 (String n, String k, int h, int b) {
        nama = n; //var awal = var inisial
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {
        System.out.println("Nama    : " + nama);
        System.out.println("Kota    : " + kota);
        System.out.println("Harga   : " + harga);
        System.out.println("Rating  : " + bintang);
    }
}