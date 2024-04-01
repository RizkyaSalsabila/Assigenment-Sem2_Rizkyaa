import java.util.Scanner;
public class MainSum24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan banyaknya perusahaan : ");
        int n = input24.nextInt();

        Sum24[] sm = new Sum24[n];

        for (int k = 0; k < n; k++) {
            System.out.println("\nPerusahaan " + (k+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = input24.nextInt();
            sm[k] = new Sum24(elm);

            for (int i = 0; i < elm; i++) {
                System.out.print("Masukkan untung bulan ke - " + (i+1) + " : ");
                sm[k].keuntungan[i] = input24.nextDouble();
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println("\n============================");
            System.out.println("Perusahaan ke - " + (k+1) + " : ");
            System.out.println("1. Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[k].elemen + " bulan adalah " + sm[k].totalBF(sm[k].keuntungan));
            System.out.println("2. Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[k].elemen + " bulan adalah " + sm[k].totalDC(sm[k].keuntungan, 0, sm[k].elemen - 1));
        }

        input24.close();
    }
}