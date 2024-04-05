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

    //Penambahan method nomer 2 latihan
    public void pencarianBuku24() {
        for (int i = 0; i < listBuku.length; i++) {
            listBuku[i] = null;
        }
    }

    void tampil() {
        for (Buku24 m : listBuku) {
            m.tampilDataBuku();
        }
    }

    //Penambahan method nomer 2 latihan
    public void bubbleSortBuku() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 0; j < listBuku.length - i - 1; j++) {
                if (listBuku[j].kodeBuku.compareTo(listBuku[j+1].kodeBuku) > 0) {
                    Buku24 obj = listBuku[j];
                    listBuku[j] = listBuku[j+1];
                    listBuku[j+1] = obj;
                }
            }
        }
    }

    public int findSeqSearchJudBuk(String cari) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].judulBuku.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    public int findBinarySearchJudBuk(String cari) {
        bubbleSortBuku();
        int left = 0;
        int right = idx - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int x = cari.compareToIgnoreCase(listBuku[mid].judulBuku);
            if (x == 0) {
                return mid; //  Kembalikan posisi, jika ditemukan
            } else if (x < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; //Kembalikan -1, jika tidak ditemukan
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
            if(buku != null && buku.judulBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    //Penambahan method nomer 2 latihan
    public void cariJudulBuku(String judul) {
        int jum = 0;
        for (int i = 0; i < idx; i++) {
            if (listBuku[i].judulBuku.equalsIgnoreCase(judul)) {
                jum++;
            }
        }

        if (jum == 0) {
            System.out.println("Judul Buku tidak ditemukan");
        } else if (jum == 1) {
            System.out.println("Judul buku ditemukan");
        } else {
            System.out.println("Peringatan : Buku dengan judul " + judul + " terdapat lebih dari satu! Salah satunya di : ");
        }
    }
}