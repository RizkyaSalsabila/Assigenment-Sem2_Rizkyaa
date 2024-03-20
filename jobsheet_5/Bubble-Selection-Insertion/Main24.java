public class Main24 {
    public static void main(String[] args) {
        //Buat objek DaftarMahasiswa
        DaftarMahasiswaBerprestasi24 list = new DaftarMahasiswaBerprestasi24();
        Mahasiswa24 m1 = new Mahasiswa24("Nusa", 2017, 25, 3);
        Mahasiswa24 m2 = new Mahasiswa24("Rara", 2012, 19, 4);
        Mahasiswa24 m3 = new Mahasiswa24("Dompu", 2018, 19, 3.5);
        Mahasiswa24 m4 = new Mahasiswa24("Abdul", 2017, 23, 2);
        Mahasiswa24 m5 = new Mahasiswa24("Ummi", 2019, 3, 3.75); 

        //objek.method
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("\n\nData Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
        
    }
}
