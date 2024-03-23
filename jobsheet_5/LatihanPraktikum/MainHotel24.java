package LatihanPraktikum;

public class MainHotel24 {
    public static void main(String[] args) {
        HotelService24 dataHotel = new HotelService24();
        //Konstruktor-objek = new Konstruktor-{isi konstruktor berparameter};
        
        System.out.println("----------------------------------");
        System.out.println("DATA RESERVASI HOTEL");
        System.out.println("----------------------------------");
        Hotel24 h1 = new Hotel24("Bella", "Pasuruan", 900000, 3);
        Hotel24 h2 = new Hotel24("Todi", "Sidoarjo", 500000, 2);
        Hotel24 h3 = new Hotel24("Emma", "Malang", 1200000, 4);
        Hotel24 h4 = new Hotel24("Udin", "Surabaya", 1300000, 5);
        Hotel24 h5 = new Hotel24("Fira", "Kediri", 700000, 1);
    
        dataHotel.tambah(h1);
        dataHotel.tambah(h2);
        dataHotel.tambah(h3);
        dataHotel.tambah(h4);
        dataHotel.tambah(h5);

        //menampilkan sebelum disorting
        System.out.println("--- DATA SEBELUM DI SORTING ---");
        dataHotel.tampilAll();

        //menampilkan setelah di sorting ASCENDING - bubble sort
        System.out.println("--- DATA SETELAH DI SORTING ---");
        System.out.println("---------------------------------------\n");

        System.out.println("-- BUBBLE SORT --");
        System.out.println("1. DATA HARGA SECARA ASCENDING");
        dataHotel.bubbleSortHarga();
        dataHotel.tampilAll();
        System.out.println("2. DATA RATING SECARA DESCENDING");
        dataHotel.bubbleSortRating();
        dataHotel.tampilAll();

        System.out.println("-- SELECTION SORT --");
        System.out.println("1. DATA HARGA SECARA ASCENDING");
        dataHotel.selectionSortHarga();
        dataHotel.tampilAll();

        System.out.println("2. DATA RATING SECARA DESCENDING");
        dataHotel.selectionSortRating();
        dataHotel.tampilAll();
    }
}