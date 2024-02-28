public class BukuMain24 {
    public static void main(String[] args) {
        //Instansiasi
        Buku24 bk1 = new Buku24();
        //Mengakses atribut pada objek
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        //Mengakses method dari objek
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println("--------------------------------------------");

        //Objek bk2 dengan konstruktor berparameter
        Buku24 bk2 = new Buku24("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        System.out.println("--------------------------------------------");

        //Objek baru
        Buku24 bukuRizkya = new Buku24("Aku Ingin Sukses", "Safira Nura", 50, 25, 68000);
        bukuRizkya.tampilInformasi();
        System.out.println("Harga Total     : " + bukuRizkya.hitungHargaTotal(5));
        System.out.println("Diskon          : " + bukuRizkya.hitungDiskon(5));
        System.out.println("Harga setelah diskon : " + bukuRizkya.hitungHargaBayar(5));
        System.out.println("--------------------------------------------");
    }
}
