import java.util.Scanner;
public class MainPersegiPanjang24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in); 

        //Input user
        System.out.print("Masukkan banyaknya persegi panjang : ");
        int jumPersegiPanjang = input24.nextInt();
        //Panjang array berdasarkan inputan user
        PersegiPanjang24[] ppArray = new PersegiPanjang24[jumPersegiPanjang];

        //Looping untuk mengisi panjang dan lebar
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang24();
            System.out.println("\nPersegi panjang ke - " + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = input24.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = input24.nextInt();
            System.out.println(" ");
        }
        System.out.println("------------------------");
        System.out.println("Hasil Tampilan :");
        //Looping untuk mengakses dan menampilkan ppArray
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke - " + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
            System.out.println(" ");
        }

        input24.close();
    }
}