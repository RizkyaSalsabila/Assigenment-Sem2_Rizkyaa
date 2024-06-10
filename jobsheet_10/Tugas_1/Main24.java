package Tugas_1;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        AntrianVaksinasi24 antri = new AntrianVaksinasi24();
        Scanner input24 = new Scanner(System.in);

        while (true) {
            System.out.println("\n--------------------------------------");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("--------------------------------------");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("--------------------------------------");
            System.out.print("Pilih (1/2/3/4) : ");
            int pilih = input24.nextInt();
            input24.nextLine();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.println("==========================");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("==========================");
                    System.out.print("Nomor Antrian : ");
                    String no = input24.nextLine();
                    System.out.print("Nama Penerima : ");
                    String nama = input24.nextLine();
                    Orang24 pasienBaru = new Orang24(no, nama);
                    antri.tambahData(pasienBaru);
                    break;
                case 2:
                    Orang24 dt = antri.hapusData();
                    if (dt != null) {
                        System.out.println(dt.nama + " telah selesai divaksinasi...");
                    }
                    break;
                case 3:
                    antri.cetak();
                    break;
                case 4:
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