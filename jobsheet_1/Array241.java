import java.util.Scanner;
public class Array241 {
    public static void main(String[] args) {
        String[] Matkul = { "Critical Thinking and Problem Solving", "Bahasa Inggris", "Pancasila", "Matematika Dasar",
                "Konsep Teknologi Informasi", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] nilaiAngka = new double[Matkul.length];
        int totalSks = 0;
        double totBobot = 0;
        Scanner input04 = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=============================");

        for (int i = 0; i < Matkul.length; i++) {
            System.out.print("Masukkan nilai (0-100) untuk Mata kuliah " + Matkul[i] + " : ");
            double nilai = input04.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                double bobot = 0;
                if (nilai >= 80) {
                    bobot = 4.0;
                } else if (nilai >= 73) {
                    bobot = 3.50;
                } else if (nilai >= 65) {
                    bobot = 3.00;
                } else if (nilai >= 60) {
                    bobot = 2.50;
                } else if (nilai >= 50) {
                    bobot = 2.00;
                } else if (nilai >= 39) {
                    bobot = 1.00;
                }
                nilaiAngka[i] = nilai;
                totBobot += bobot;
                totalSks++;
            } else {
                System.out.println("nilai ");
                return;
            }
        }
        System.out.printf("=======================%n");
        System.out.printf("%n%nHasil Konversi Nilai%n");
        System.out.printf("=======================%n");
        System.out.printf("%-40s%10s%15s%15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < totalSks; i++) {
            double bobot = 0;
            String NilaiHuruf;
            if (nilaiAngka[i] >= 80) {
                bobot = 4.0;
                NilaiHuruf = "A";
            } else if (nilaiAngka[i] >= 73) {
                bobot = 3.50;
                NilaiHuruf = "B+";
            } else if (nilaiAngka[i] >= 65) {
                bobot = 3.00;
                NilaiHuruf = "B";
            } else if (nilaiAngka[i] >= 60) {
                bobot = 2.50;
                NilaiHuruf = "C+";
            } else if (nilaiAngka[i] >= 50) {
                bobot = 2.00;
                NilaiHuruf = "C";
            } else if (nilaiAngka[i] >= 39) {
                bobot = 1.00;
                NilaiHuruf = "D";
            } else {
                bobot = 0.00;
                NilaiHuruf = "E";
            }
            System.out.printf("%-40s%10s%15s%15s%n", Matkul[i], nilaiAngka[i], NilaiHuruf, bobot);
        }
        System.out.printf("IP SEMESTER : %.2f%n", totBobot / totalSks);
    }

  

}
