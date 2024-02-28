import java.util.Scanner;
public class Array24 {
    public static void main(String[] args) {
        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[matkul.length];
        String nilaiHuruf;
        int totalSks = 0;
        double bobotNilai = 0, totBobot = 0;

        Scanner input24 = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("-----------------------------------");

        for(int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + matkul[i] + " : ");
            int nilai = input24.nextInt();
            nilaiAngka[i] = nilai;

            if(80 < nilaiAngka[i] && nilaiAngka[i] <= 100) {
                bobotNilai = 4.00;
            } else if(73 < nilaiAngka[i] && nilaiAngka[i] <= 80) {
                bobotNilai = 3.5;
            } else if(65 < nilaiAngka[i] && nilaiAngka[i] <= 73) {
                bobotNilai = 3.00;
            } else if(60 < nilaiAngka[i] && nilaiAngka[i] <= 65) {
                bobotNilai = 2.5;
            } else if(50 < nilaiAngka[i] && nilaiAngka[i] <= 60) {
                bobotNilai = 2.00;
            } else if(39 < nilaiAngka[i] && nilaiAngka[i] <= 50) {
                bobotNilai = 1.00;
            } else {
                bobotNilai = 0.00;
            }
            nilaiAngka[i] = nilai;
            totBobot += bobotNilai;
            totalSks++;
            
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("-----------------------------------");
        System.out.printf("%s\t\t\t\t%s\t%s\t%s", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai\n");

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
            
            System.out.printf("%-40s%10s%15s%15s%n", matkul[i], nilaiAngka[i], NilaiHuruf, bobot);
            //%-40s%10s%15s%15s%n
        }
        System.out.printf("\nIP SEMESTER : %.2f%n", totBobot / totalSks);
        System.out.println("-----------------------------------");
    
    input24.close();
    }
}