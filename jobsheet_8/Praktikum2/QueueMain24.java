package Praktikum2;

import java.util.Scanner;
public class QueueMain24 {
    public static void menu() {
        System.out.println("\nMenu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-------------------------");
        System.out.print("Pilih (1/2/3/4) : ");
    } 
    
    public static void main(String[] args) {
        //deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //input banyaknya kapasitas
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();

        //instansiasi objek bernama antri
        QueueNasabah24 antri = new QueueNasabah24(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Saldo : ");
                    double saldo = sc.nextDouble();
                    Nasabah24 nsbh = new Nasabah24(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.enqueue(nsbh);
                    break;
                case 2:
                    Nasabah24 data = antri.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar : ");
                        System.out.println("No Rekening : " + data.norek);
                        System.out.println("Nama : " + data.nama);
                        System.out.println("Alamat : " + data.alamat);
                        System.out.println("Umur : " + data.umur);
                        System.out.println("Saldo : " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

        sc.close();
    }
}