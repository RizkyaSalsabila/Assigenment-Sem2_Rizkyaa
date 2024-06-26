package Tugas_2;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) throws Exception {
        AntrianFilm24 antrian = new AntrianFilm24();
        Scanner input24 = new Scanner(System.in);

        while (true) {
            System.out.println("\n--------------------------------------");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("--------------------------------------");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("--------------------------------------");
            System.out.print("Pilih (1 - 10) : ");
            int pilih = input24.nextInt();
            input24.nextLine();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.println("-- Masukkan Data Film Posisi Awal --");
                    System.out.print("ID Film      : ");
                    int id_awal = input24.nextInt();
                    input24.nextLine();
                    System.out.print("Judul Film   : ");
                    String judul_awal = input24.nextLine();
                    System.out.print("Rating Film  : ");
                    Double rating_awal = input24.nextDouble();
                    input24.nextLine();

                    Film24 tFilmAwal = new Film24(id_awal, judul_awal, rating_awal);
                    antrian.tambahAwal(tFilmAwal);
                    break;
                case 2:
                    System.out.println("-- Masukkan Data Film Posisi Akhir --");
                    System.out.print("ID Film : ");
                    int id_akhir = input24.nextInt();
                    input24.nextLine();
                    System.out.print("Judul Film : ");
                    String judul_akhir = input24.nextLine();
                    System.out.print("Rating Film : ");
                    Double rating_akhir = input24.nextDouble();
                    input24.nextLine();

                    Film24 tFilmAkhir = new Film24(id_akhir, judul_akhir, rating_akhir);
                    antrian.tambahAkhir(tFilmAkhir);
                    break;
                case 3:
                    System.out.println("-- Masukkan Data Film Urutan Ke --");
                    System.out.print("ID Film : ");
                    int id = input24.nextInt();
                    input24.nextLine();
                    System.out.print("Judul Film : ");
                    String judul = input24.nextLine();
                    System.out.print("Rating Film : ");
                    Double rating = input24.nextDouble();
                    input24.nextLine();
                    System.out.print("\nData ini akan masuk di indeks ke - : ");
                    int index = input24.nextInt();
                    input24.nextLine();

                    Film24 tFilm = new Film24(id, judul, rating);
                    antrian.tambahData(tFilm, index);
                    break;
                case 4:
                    antrian.hapusPertama();
                    break;
                case 5:
                    antrian.hapusAkhir();
                    break;
                case 6:
                    System.out.println("-- NB : Indeks dihitung mulai 0 --");
                    System.out.println("\n-- Penghapusan perlu input index --");
                    System.out.print("Index Film ke - : ");
                    index = input24.nextInt();
                    input24.nextLine();
                    antrian.hapusData(index);
                    break;
                case 7:
                    antrian.cetak();
                    break;
                case 8:
                    System.out.println("-- Pencarian Berdasarkan id film --");
                    System.out.println("\nPencarian perlu input id");
                    System.out.print("ID Film : ");
                    id = input24.nextInt();
                    input24.nextLine();
                    System.out.println("-------------------------");
                    antrian.carFilm(id);
                    break;
                case 9:
                    System.out.println("-- Data diurutkan (DESC) berdasarkan rating ipk --");
                    antrian.urutData();
                    break;
                case 10:
                    System.out.println("Anda keluar dari sistem");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan tidak valid.");
                    System.out.println("Silahkan coba lagi !!!");
                    break;
            }
        }
    }
}