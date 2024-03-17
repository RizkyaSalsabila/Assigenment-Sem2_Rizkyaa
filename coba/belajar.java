import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
        int nilai;
        Scanner input24 = new Scanner(System.in);
        if(nilai >= 0 && nilai <= 100) {
            System.out.println("Masukkan Nilai tugas : ");
            int nTugas = input24.nextInt();
            System.out.println("Masukkan Nilai kuis : ");
            int nKuis = input24.nextInt();
            System.out.println("Masukkan Nilai UTS : ");
            int nUTS = input24.nextInt();
            System.out.println("Masukkan Nilai UAS : ");
            int nUAS = input24.nextInt();
        } else {
            System.out.println("Nilai tidak valid");
        }
        

        double nAkhir = (nTugas*0.2) + (nKuis*0.2) + (nUTS*0.3) + (nUAS*0.4);
        input24.close();
    }
}