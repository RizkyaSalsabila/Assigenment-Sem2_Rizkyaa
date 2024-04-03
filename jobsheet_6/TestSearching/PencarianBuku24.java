public class PencarianBuku24 {
    Buku24 listBuku[] = new Buku24[5];
    int idx;

    //method tambahBuku
    void tambah(Buku24 m) {
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku24 m : listBuku) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = 1;
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j].kodeBuku==cari) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("=Data " + x + " ditemukan pada indeks " + pos + " =");
        } else {
            System.out.println("=Data " + x + " tidak ditemukan=");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku    : " +listBuku[pos].kodeBuku);
            System.out.println("Judul        : " + listBuku[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang    : " + listBuku[pos].pengarang);
            System.out.println("Stock        : " + listBuku[pos].stock);
        } else {
            System.out.println("=Data " + x + " tidak ditemukan=");
        }
    } 
}
