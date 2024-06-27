package percobaan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa24 {
    List<Mahasiswa24> mahasiswas = new ArrayList<> ();

    //method tambah
    public void tambah(Mahasiswa24... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    //method hapus
    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    //method update
    public void update(int index, Mahasiswa24 mhs) {
        mahasiswas.set(index, mhs);
    }

    //method cetak
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(" " + mhs.toString());
        });
    }

    //fungsi pencairan
    // int linearSearch(String nim) {
    //     for (int i = 0; i < mahasiswas.size(); i++) {
    //         if (nim.equals(mahasiswas.get(i).nim)) {
    //             return 1;
    //         }
    //     }
    //     return -1;
    // }

    //NOMER 2
    int binarySearch(String nim) {
        sortByNim(true);
        Mahasiswa24 kunci = new Mahasiswa24(nim, "", "");
        return Collections.binarySearch(mahasiswas, kunci, Comparator.comparing(Mahasiswa24::getNim));
    }

    //NOMER 3
    void sortByNim(boolean ascending) {
        if (ascending) {
            Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa24::getNim));
        } else {
            Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa24::getNim).reversed());
        }
    }


    public static void main(String[] args) {
        ListMahasiswa24 lm = new ListMahasiswa24();
        Mahasiswa24 m = new Mahasiswa24("201234", "Noureen", "021xx1");
        Mahasiswa24 m1 = new Mahasiswa24("201235", "Akhleema", "021xx2");
        Mahasiswa24 m2 = new Mahasiswa24("201236", "Shannum", "021xx3");

        //tambah objek mahasiswa
        lm.tambah(m, m1, m2);

        //cetak semua list mahasiswa
        System.out.println("-- Sebelum diupadate --");
        lm.tampil();

        //update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa24("201235", "Akhleema Lela", "021xx2"));
        System.out.println(" ");
        System.out.println("-- Setelah diupadate --");
        lm.tampil();

        //urutkan mahasiswa ascending
        System.out.println("");
        System.out.println("-- Urutan Ascending --");
        lm.sortByNim(true);
        lm.tampil();
        
        //urutkan mahasiswa descending
        System.out.println("");
        System.out.println("-- Urutan Descending --");
        lm.sortByNim(false);
        lm.tampil();
        
    }
}
