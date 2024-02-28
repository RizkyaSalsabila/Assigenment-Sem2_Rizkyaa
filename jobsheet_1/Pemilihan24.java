import java.util.Scanner;
public class Pemilihan24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Deklarasi Variabel
        int nTugas, nKuis, nUTS, nUAS;
        double nAkhir;
        String nHuruf;

        System.out.println("--------------------------------");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("--------------------------------");

        System.out.println("Nilai Hanya Boleh diisi 0 - 100\n");
        //input user
        System.out.print("Masukkan Nilai Tugas : ");
        nTugas = input24.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nKuis = input24.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nUTS = input24.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nUAS = input24.nextInt();

        System.out.println("--------------------------------");

        //Hitung Nilai Akhir
        nAkhir = (0.2*nTugas) + (0.2*nKuis) + (0.3*nUTS) + (0.4*nUAS);
        
        if((nTugas < 0 || nTugas >= 100) || (nKuis < 0 || nKuis >= 100) || (nUTS < 0 || nUTS >= 100) || (nUAS < 0 || nUAS >= 100)) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("--------------------------------");
        } else {
            if(80 < nAkhir && nAkhir <= 100) {
                nHuruf = "A";
            } else if(73 < nAkhir && nAkhir <= 80) {
                nHuruf = "B+";
            } else if(65 < nAkhir && nAkhir <= 73) {
                nHuruf = "B";
            } else if(60 < nAkhir && nAkhir <= 65) {
                nHuruf = "C+";
            } else if(50 < nAkhir && nAkhir <= 60) {
                nHuruf = "C";
            } else if(39 < nAkhir && nAkhir <= 50) {
                nHuruf = "D";
            } else {
                nHuruf = "E";
            }

            System.out.println("Nilai Akhir : " + nAkhir);
            System.out.println("Nilai Huruf : " + nHuruf);
            System.out.println("--------------------------------");
            if(nHuruf == "D" || nHuruf == "E") {
                System.out.println("Mohon Maaf Anda Tidak Lulus");
            } else {
                System.out.println("Selamat Anda Lulus");
            }
            System.out.println("--------------------------------");
        }
        input24.close();
    }
}