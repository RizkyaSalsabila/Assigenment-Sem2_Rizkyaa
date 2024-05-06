package Tugas;

import java.util.Scanner;
public class QueueMainPembeli24 {
    public static void menu() {
        System.out.println("\nMenu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Terbelakang");
        System.out.println("5. Cari Antrian Berdasarkan Nama");
        System.out.println("6. Lihat Daftar Antrian Pembeli");
        System.out.println("7. Keluar");
        System.out.println("------------------------");
        System.out.print("Pilih (1/2/3/4/5/6/7) : ");
    }

    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner input24 = new Scanner(System.in);

        //input banyaknya kapasitas
        System.out.print("Masukkan banyaknya pembeli : ");
        int jumlah = input24.nextInt();

        //instansiasi objek bernama pembeli
        QueuePembeli24 pembeli = new QueuePembeli24(jumlah);

        int pilih;
        do {
            menu();
            pilih = input24.nextInt();
            input24.nextLine();
            System.out.println("");
            switch (pilih) {
                case 1:     //panggil method enqueue untuk menambahkan antrian pada posisi belakang
                    System.out.print("Nama : ");
                    String nama = input24.nextLine();
                    System.out.print("No HP : ");
                    String noHP = input24.nextLine();

                    Pembeli24 pbl = new Pembeli24(nama, noHP);
                    pembeli.enqueue(pbl);
                    break;
                case 2:     //panggil method dequeue untuk mengeluarkan antrian paling depan
                    Pembeli24 data = pembeli.dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noHP)) {
                        System.out.println("Antrian yang keluar : ");
                        System.out.println("Nama : " + data.nama);
                        System.out.println("No HP " + data.noHP);
                    }
                    break;
                case 3:     //panggil method peekRear untuk melihat posisi depan
                    pembeli.peek();
                    break;
                case 4:     //panggil method peekRear untuk melihat posisi belakang
                    pembeli.peekRear();
                    break;
                case 5:     //panggil method peekPosition dengan parameter nama
                    System.out.print("Masukkan Nama Pembeli yang ingin dicari : ");
                    String cariNama = input24.nextLine();
                    pembeli.peekPosition(cariNama);
                    break;
                case 6:     //panggil method daftarPembeli
                    System.out.println("--- Daftar Antrian Pembeli ---");
                    pembeli.daftarPembeli();
                    break;
                case 7:     //case untuk keluar
                System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak valid. Silahkan isi dengan benar");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);

    input24.close();
    }   
}