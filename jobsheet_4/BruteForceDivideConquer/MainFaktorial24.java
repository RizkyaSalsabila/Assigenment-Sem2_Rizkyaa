package jobsheet_4.BruteForceDivideConquer;

import java.util.Scanner;
public class MainFaktorial24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = input24.nextInt();

        Faktorial24[] fk = new Faktorial24[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial24();
            System.out.print("Masukkan nilai data ke - " + (i+1) + " : ");
            fk[i].nilai = input24.nextInt();
        }

        System.out.println("\nHASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("---------------------------");

        System.out.println("\nHASIL - DIVIDE AND CONQUER");
        for (int i = 0 ; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("---------------------------");


        input24.close();
    }
}