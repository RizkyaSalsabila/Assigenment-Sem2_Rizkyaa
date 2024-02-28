public class Buku24 {
    //Atribut
    String judul, pengarang;
    int halaman, stok, harga;

    //Konstruktor default
    public Buku24() {

    }

    //Konstruktor berparameter
    public Buku24(String jud, String pg, int hal, int stok, int hrg) {
        judul = jud;    //atribut = parameter
        pengarang = pg;
        halaman = hal;
        this.stok = stok;   //ditambahin this.atribut = parameter (krn sama)
        harga = hrg;
    }

    //method tampilInformasi()
    void tampilInformasi() {
        System.out.println("Judul           : " + judul);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Jumlah Halaman  : " + halaman);
        System.out.println("Sisa Stok       : " + stok);
        System.out.println("Harga           : " + harga);
    }

    //method terjual()
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    //method restock()
    void restock(int jml) {
        stok = stok + jml;
    }

    //method gantiHarga() 
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    //method hitungHargaTotal()
    int hitungHargaTotal(int jml) {
        int hargaTotal = harga * jml;
        return hargaTotal; 
    }

    //method hitungDiskon()
    int hitungDiskon(int jml) {
        int diskon = 0;
        int hargaTotal = hitungHargaTotal(jml);
        if(hargaTotal > 150000) {
            diskon = (int)(0.12*harga);
        } else if(hargaTotal > 75000 && hargaTotal <= 150000) {
            diskon = (int)(0.5*harga); 
        } else {
            diskon = 0;
        }
        return diskon;
    }

    //method hitungHargaBayar()
    int hitungHargaBayar(int jml) {
        return hitungHargaTotal(jml) - hitungDiskon(jml);

    }
    
}