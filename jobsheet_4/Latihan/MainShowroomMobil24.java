package Latihan;
import java.util.Scanner;

public class MainShowroomMobil24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mobil : ");
        int n = input24.nextInt();
        input24.nextLine();

        ShowroomMobil24[] mbl = new ShowroomMobil24[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\nData Mobil ke - " + (i+1));
            System.out.print("Merk : ");
            String merk = input24.nextLine();
            System.out.print("Tipe : ");
            String tipe = input24.nextLine();
            System.out.print("Tahun : ");
            int tahun = input24.nextInt();
            System.out.print("Top Acceleration : ");
            int top_acceleration = input24.nextInt();
            System.out.print("Top Power : ");
            int top_power = input24.nextInt();
            input24.nextLine();
            mbl[i] = new ShowroomMobil24(merk, tipe, tahun, top_acceleration, top_power);
        }

        System.out.println("----------------------------");
        System.out.println("TAMPIL KESELURUHAN");
        System.out.println("----------------------------");
        for (int j = 0; j < n; j++) {
            System.out.println("\nMobil ke - " + (j+1));
            System.out.println("Merk             : " + mbl[j].merk);
            System.out.println("Tipe             : " + mbl[j].tipe);
            System.out.println("Tahun            : " + mbl[j].tahun);
            System.out.println("Top Acceleration : " + mbl[j].top_acceleration);
            System.out.println("Top Power        : " +mbl[j].top_power);
        }
        System.out.println("----------------------------\n");

        int maxTopAcceleration = maxAcceleration(mbl, 0, mbl.length - 1);
        System.out.println("Top Acceleration TERTINGGI : " + maxTopAcceleration);

        int minTopAcceleration = minAcceleration(mbl, 0, mbl.length - 1);
        System.out.println("Top Acceleration TERENDAH : " + minTopAcceleration);
        
        double rata2_TopPower = rata2(mbl);
        System.out.println("RATA RATA Top Power : " + rata2_TopPower);

        input24.close();
    }

    public static int maxAcceleration(ShowroomMobil24[] mbl, int min, int max) {
        if (min == max) {
            return mbl[min].top_acceleration;
        } else if (max - min == 1) {
            return Math.max(mbl[min].top_acceleration, mbl[max].top_acceleration);
        } else {
            int mid = (min + max) / 2;
            int leftMax = maxAcceleration(mbl, min, mid);
            int rightMax = maxAcceleration(mbl, mid + 1, max);
            return Math.max(leftMax, rightMax);
        }
    }

    public static int minAcceleration(ShowroomMobil24[] mbl, int min, int max) {
        if (min == max) {
            return mbl[min].top_acceleration;
        } else if (max - min == 1) {
            return Math.min(mbl[min].top_acceleration, mbl[max].top_acceleration);
        } else {
            int mid = (min + max) / 2;
            int leftMin = maxAcceleration(mbl, min, mid);
            int rightMin = maxAcceleration(mbl, mid + 1, max);
            return Math.min(leftMin, rightMin);
        }
    }

    public static double rata2 (ShowroomMobil24[] mbl) {
        int totPower = 0;
        for (ShowroomMobil24 mobil : mbl) {
            totPower = totPower + mobil.top_power;
        }
        return (double) totPower / mbl.length;
    }
}