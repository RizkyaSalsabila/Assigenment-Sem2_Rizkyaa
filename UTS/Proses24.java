public class Proses24 {
    Barang24 listBarang[] = new Barang24[5];
    int idx;

    //soal nomer 1
    void tambah(Barang24 brg) {
        if (idx < listBarang.length) {
            listBarang[idx] = brg;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh !");
        }
    }

    //soal nomer 2
    void tampil() {
        for (Barang24 b : listBarang) {
            b.tampil();
            System.out.println("----------------------------------");
        }
    }
    
    //soal nomer 3
    //method untuk memfilter menaik berdasarkan stok
    void bubbleSort() {
        for (int i = 0; i < listBarang.length-1; i++) {
            for (int j = 1; j < listBarang.length-i; j++) {
                if (listBarang[j].stok < listBarang[j-1].stok) {
                    //proses penukaran atau swap
                    Barang24 tmp = listBarang[j];
                    listBarang[j] = listBarang[j-1];
                    listBarang[j-1] = tmp;
                }
            }
        }
    }

    //soal nomer 4
    void tampilBarangFilter() {
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i].kategori.equalsIgnoreCase("food") && listBarang[i].stok == 0) {
                System.out.println("Kode Barang  : " +listBarang[i].kodeBarang);
                System.out.println("Nama         : " + listBarang[i].nama);
                System.out.println("Kategori     : " + listBarang[i].kategori);
                System.out.println("Harga Satuan : " + listBarang[i].hargaSatuan);
                System.out.println("Stok         : " + listBarang[i].stok);
                System.out.println(" ");
            } 
        }
    }

    //soal nomer 5
    public int findSeqSearchNama(String cari) {
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i].nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    public void tampilPosisi(String cari, int pos) {
        if (pos != -1) {
            System.out.println("=Data " + cari + " ditemukan =");
            System.out.println("Kode Barang  : " +listBarang[pos].kodeBarang);
            System.out.println("Nama         : " + listBarang[pos].nama);
            System.out.println("Kategori     : " + listBarang[pos].kategori);
            System.out.println("Harga Satuan : " + listBarang[pos].hargaSatuan);
            System.out.println("Stok         : " + listBarang[pos].stok);
        } else {
            System.out.println("=Data " + cari + " tidak ditemukan=");
        }
    }

    //soal nomer 6
    public void tambahStok(String nama, int jumlah) {
        int idx = findSeqSearchNama(nama);
        if (idx != -1) { // Jika barang ditemukan
            listBarang[idx].stok += jumlah; //tambah stok
            System.out.println("Stock barang " + nama + " berhasil ditambahkan.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    //soal nomer 7
    public void kurangiStok(String nama, int jumlah) {
        int idx = findSeqSearchNama(nama);
        if (idx != -1) { 
            if (listBarang[idx].stok >= jumlah) { 
                listBarang[idx].stok -= jumlah; // Kurangi stock
                System.out.println("Stock barang " + nama + " berhasil dikurangi.");
            } else {
                System.out.println("Stock barang tidak cukup.");
            }
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}