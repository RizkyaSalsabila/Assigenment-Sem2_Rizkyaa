package KUIZ;
import java.util.Scanner;

public class MobilMain24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        int n;
        Scanner input24 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya koleksi mobil : ");
        n = input24.nextInt();
        input24.nextLine();

        Mobil24[] mbl = new Mobil24[n];

        for (int i = 0; i < mbl.length; i++) {
            mbl[i] = new Mobil24();
            System.out.println("\nMobil ke " + i);
            System.out.print("Masukkan nama mobil : ");
            mbl[i].nama = input24.nextLine();
            System.out.print("Masukkan cc : ");
            mbl[i].cc = input24.nextInt();
            input24.nextLine();
            System.out.print("Masukkan harga beli : ");
            mbl[i].hargaBeli = input24.nextInt();
            System.out.print("Masukkan tahun produksi : ");
            mbl[i].thnProduksi = input24.nextInt();
            input24.nextLine();
        }

        double totalBiayaPerawatan = 0;
        int count = 0;
        for (Mobil24 mobil : mbl) {
            if (mobil.thnProduksi > 2010) {
                totalBiayaPerawatan += mobil.hitungBiayaPerawatan();
                count++;
            }
        }
        double rataBiayaPerawatan = totalBiayaPerawatan / count;
        System.out.println("Biaya perawatan rata-rata dari mobil dengan tahun produksi > 2010: " + rataBiayaPerawatan);

        // Mencari biaya total terbesar dari mobil dengan cc > 1500 dan tahun produksi < 2010
        double maxBiayaTotal = 0;
        Mobil24 mobilTerbesar = null;
        for (Mobil24 mobil : mbl) {
            if (mobil.thnProduksi < 2010 && mobil.cc > 1500) {
                double biayaTotal = mobil.hitungBiayaTotal();
                if (biayaTotal > maxBiayaTotal) {
                    maxBiayaTotal = biayaTotal;
                    mobilTerbesar = mobil;
                }
            }

        input24.close();
    }
    }
}
