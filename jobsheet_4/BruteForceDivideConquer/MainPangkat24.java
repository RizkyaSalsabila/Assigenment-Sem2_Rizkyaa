import java.util.Scanner;
public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = input24.nextInt();

        Pangkat24[] png = new Pangkat24[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat24();
            System.out.print("\nMasukkan nilai yang akan dipangkatkan : ");
            png[i].nilai = input24.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            png[i].pangkat = input24.nextInt();
        }

        System.out.println("\nHASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " 
            + png[i].nilai + " pangkat " 
            + png[i].pangkat + " adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat)
            );
        }
        System.out.println("-----------------------------");

        System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
            + png[i].nilai + " pangkat "
            + png[i].pangkat + " adalah " 
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
            );
        }
        System.out.println("-----------------------------");
        input24.close();
    }
}