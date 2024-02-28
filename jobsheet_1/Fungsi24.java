import java.util.Scanner;
public class Fungsi24 {
        static Scanner input24 = new Scanner(System.in);
        static int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        static String[] toko = {
            "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"
        };
        static int[] harga = {75000, 50000, 60000, 10000};
        static int[] penguranganStok = {-1, -2, -0, -5};
        static double[] totPendapatan = new double[4];

    public static void main(String[] args) {
        System.out.println("Toko Bunga\t\tAglonema\tKeladi\t\tAlocasia\tMawar");
        System.out.println(" ");
        for (int i = 0; i < toko.length; i++) {
            System.out.print(toko[i] + "\t");
            for (int k = 0; k < stock[i].length; k++) {
                System.out.printf("%15d", stock[i][k]);
            }
            System.out.println(" ");
        }

        System.out.println("------------------------------------------------------------------------------------\n");
        tampilPendapatan();
        tampilStok4();
    }

    static void tampilPendapatan() {
        for (int i = 0; i < toko.length; i++) {
            int pendapatan = 0;
            for (int k = 0; k < stock[i].length; k++) {
                pendapatan += (stock[i][k] - penguranganStok[k]) * harga[k];
            }
            System.out.println("Pendapatan " + toko[i] + " : Rp " + pendapatan);
        }
        System.out.println("------------------------------------------------------------------------------------\n");
    }

    static void tampilStok4() {
        System.out.println(toko[3]);
        System.out.printf("Stok Awal :\t%d%5d%5d%5d", stock[3][0], stock [3][1], stock [3][2], stock [3][3]);
        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] += penguranganStok[i];
        }
        System.out.printf("\nStok Sisa :\t%d%5d%5d%5d", stock[3][0], stock [3][1], stock [3][2], stock [3][3]);
        System.out.println("\n------------------------------------------------------------------------------------\n");
    }
}