import java.util.Scanner;
public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        /*System.out.println("-----------------------------");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = input24.nextInt();*/

        Pangkat24[] png = new Pangkat24[3];
        png[0] = new Pangkat24(2, 4);
        png[1] = new Pangkat24(3, 5);
        png[2] = new Pangkat24(5, 2);

        /*for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat24();
            System.out.print("\nMasukkan nilai yang akan dipangkatkan : ");
            png[i].nilai = input24.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            png[i].pangkat = input24.nextInt();
        }*/

        System.out.println("-----------------------------");
        System.out.println("Metode perhitungan yang Anda gunakan : ");
        System.out.println("1. Metode Brute Force");
        System.out.println("2. Metode Divide and Conquer");
        System.out.println("-----------------------------\n");
        System.out.print("Pilih (1/2) : ");
        int pilih = input24.nextInt();
        input24.nextLine();
        System.out.println("-----------------------------");

        switch (pilih) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat " 
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                    );
                }
                System.out.println("-----------------------------");
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah " 
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                    );
                }
                System.out.println("-----------------------------");
                break;
    
            default:
                System.out.println("Input yang Anda masukkan tidak valid. Silahkan isi dengan benar");
                break;
        }
        input24.close();
    }
}
