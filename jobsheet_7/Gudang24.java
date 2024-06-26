public class Gudang24 {
    Barang24[] tumpukan;
    int size;
    int top;
    
    public Gudang24(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang24[size];
        top = -1;
    }

    boolean cekKosong() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    //Tambah Barang == push
    void tambahBarang(Barang24 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang.");
        } else {
            System.out.println("Gagal! Tumpukan Barang di Gudang sudah penuh");
        }
    }

    //Ambil barang == pengurangan barang == pop
    Barang24 ambilBarang() {
        if(!cekKosong()) {
            Barang24 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    //Lihat Barang == Pengecekan Barang == peek
    Barang24 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang24 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else { 
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    //LATIHAN PRAKTIKUM poin A
    Barang24 lihatBarangTerbawah() {
        if(!cekKosong()) {
           Barang24 barangTerbawah = tumpukan[0];
           System.out.println("Barang Terbawah : " + barangTerbawah.nama);
           return barangTerbawah;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan Barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }

    //LATIHAN PRAKTIKUM poin B
    public Barang24 cariBarangKode(int cariKode) {
        if(!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == cariKode) {
                    System.out.println("Barang dengan kode : " + tumpukan[i].kode + " ditemukan.");
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan kode " + cariKode + " tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    public Barang24 cariBarangNama(String cariNama) {
        if(!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(cariNama)) {
                    System.out.println("Barang dengan nama : " + tumpukan[i].nama + " ditemukan.");
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan nama " + cariNama + " tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    //PERCOBAAN 2
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi24 stack = new StackKonversi24();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}