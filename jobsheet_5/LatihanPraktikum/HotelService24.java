package LatihanPraktikum;

public class HotelService24 {
    Hotel24 rooms[] = new Hotel24[5];
    int idx = 0;
    
    void tambah(Hotel24 H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Mohon maaf data sudah penuh ");
        }
    }

    void tampilAll() {
        for (Hotel24 htl : rooms) {
            htl.tampil();
            System.out.println(" ");
        }
        System.out.println("---------------------------------------");
    }

    //method dengan bubble sort melalui ASCENDING (kecil ke besar) HARGA
    void bubbleSortHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel24 data = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = data;
                }
            }
         }
    }

    //method dengan selection sort melalui ASCENDING (kecil ke besar)
    void selectionSortHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxAwal = i;
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxAwal].harga) {
                    idxAwal = j;
                }
            }

        Hotel24 data = rooms[idxAwal];
        rooms[idxAwal] = rooms[i];
        rooms[i] = data;
        }
    }

    //method dengan bubble sort melalui DESCENDING (besar ke kecil) RATING
    void bubbleSortRating() {
        for (int a = 0; a < rooms.length - 1; a++) {
            for (int b = 1; b < rooms.length - a; b++) {
                if (rooms[b].bintang > rooms[b-1].bintang) {
                    Hotel24 data = rooms[b];
                    rooms[b] = rooms[b-1];
                    rooms[b-1] = data;
                }
            }
        }
    } 

    //method dengan selection sort DESCENDING (besar ke kecil) RATING
    void selectionSortRating() {
        for (int a = 0; a < rooms.length - 1; a++) {
            int idAwal = a;
            for (int b = a + 1; b < rooms.length; b++) {
                if (rooms[b].bintang > rooms[idAwal].bintang) {
                    idAwal = b;
                }
            }

        Hotel24 data = rooms[idAwal];
        rooms[idAwal] = rooms[a];
        rooms[a] = data;
        }
    }
}