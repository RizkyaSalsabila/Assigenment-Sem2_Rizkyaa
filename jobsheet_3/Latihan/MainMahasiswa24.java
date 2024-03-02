import java.util.Scanner;
public class MainMahasiswa24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        double tot = 0;
        double sum = 0;
        Mahasiswa24[] mhs = new Mahasiswa24[3];

        for (int i = 0; i < mhs.length; i++) {

            mhs[i] = new Mahasiswa24();

            System.out.println("\nMasukkan data mahasiswa ke - " + (i+1));
            System.out.print("Masukkan nama : ");
            mhs[i].nama = input24.next();
            System.out.print("Masukkan NIM : ");
            mhs[i].nim = input24.next();
            System.out.print("Masukkan jenis kelamin : ");
            mhs[i].jenisKelamin = input24.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            mhs[i].IPK = input24.nextDouble();

            tot += mhs[i].IPK;      //untuk menampung semua ipk yang diinput
            double akhir = tot;     //semua nilai ditampung pada variabel akhir
            input24.nextLine();
        }

        System.out.println("\n-------------------------");
        System.out.println("Hasil");
        System.out.println("-------------------------\n");

        for (int k = 0; k < mhs.length; k++) {
            System.out.println("\nData Mahasiswa ke - " + (k+1));
            System.out.println("Nama : " + mhs[k].nama);
            System.out.println("NIM : " + mhs[k].nim);
            System.out.println("Jenis Kelamin : " + mhs[k].jenisKelamin);
            System.out.println("IPK : " + mhs[k].IPK);
        }

        double rata2 = tot / mhs.length;
        System.out.print("Rata rata : " + rata2);
        System.out.printf("%.2f" , rata2);
        System.out.println(" ");

        input24.close();
    }
}