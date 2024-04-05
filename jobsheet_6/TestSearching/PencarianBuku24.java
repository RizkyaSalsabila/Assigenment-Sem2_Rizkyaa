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

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String cari, int pos) {
        if (pos != -1) {
            System.out.println("=Data " + cari + " ditemukan pada indeks " + pos + " =");
        } else {
            System.out.println("=Data " + cari + " tidak ditemukan=");
        }
    }

    public void tampilData(String cari, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku    : " +listBuku[pos].kodeBuku);
            System.out.println("Judul        : " + listBuku[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang    : " + listBuku[pos].pengarang);
            System.out.println("Stock        : " + listBuku[pos].stock);
        } else {
            System.out.println("=Data " + cari + " tidak ditemukan=");
        }
    } 

    //Penambahan nomer 3
    public Buku24 findBuku(String cari) {
        for (Buku24 buku : listBuku) {
            if(buku.kodeBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cari.equals(listBuku[mid].kodeBuku)) {
            return mid;
            } else if (cari.compareTo(listBuku[mid].kodeBuku) < 0) {
            right = mid - 1;
            } else {
            left = mid + 1;
            }
        }
        return -1;
    }
}