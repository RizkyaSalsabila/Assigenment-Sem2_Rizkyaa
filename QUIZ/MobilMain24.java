package QUIZ;
import java.util.Scanner;

public class MobilMain24 {

    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.print("Banyak koleksi mobil: ");
        int n = input24.nextInt();
        input24.nextLine();
        System.out.println("------------------------------");
        
        Mobil24[] mbl = new Mobil24[n];
        
        for (int i = 0; i < mbl.length; i++) {
            System.out.print("\nNama mobil: ");
            String nama = input24.nextLine();
            System.out.print("CC mobil: ");
            int cc = input24.nextInt();
            System.out.print("Harga Beli: ");
            int hargaBeli = input24.nextInt();
            System.out.print("Tahun Produksi: ");
            int thnProduksi = input24.nextInt();
            input24.nextLine();
            
            mbl[i] = new Mobil24(nama, cc, hargaBeli, thnProduksi);
        }

        double totBiayaPerawatan = 0;
        double maxBiayaTotal = 0;
        int x = 0;
        for (int i = 0; i < mbl.length; i++) {
            if (mbl[i].thnProduksi > 2010) {
                totBiayaPerawatan += mbl[i].hitungBiayaPerawatan();
                x++;
            } else if (mbl[i].cc > 1500 && mbl[i].thnProduksi < 2010) {
                if (maxBiayaTotal < mbl[i].hitungBiayaTotal()) {
                    maxBiayaTotal += mbl[i].hitungBiayaTotal();
                }
            }
        }
        totBiayaPerawatan /= x;

        System.out.println("\n------------------------------");
        System.out.println("Hasil Data Mobil");
        System.out.println("------------------------------");
        
        for (int i = 0; i < mbl.length; i++) {
            mbl[i].printData();
        }

        System.out.println("------------------------------");
        System.out.println("Rata-rata Biaya Perawatan Mobil Tahun 2010 ke-atas: " + totBiayaPerawatan);
        System.out.println("Biaya Mobil Terbesar untuk CC > 1500 & Tahun Produksi 2010 ke-bawah: " + maxBiayaTotal);

        input24.close();
    }
}