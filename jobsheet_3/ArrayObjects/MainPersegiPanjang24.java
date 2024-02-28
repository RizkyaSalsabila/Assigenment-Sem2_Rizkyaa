import java.util.Scanner;
public class MainPersegiPanjang24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in); 
        //Instansiasi ppArray dengan panjang 3
        PersegiPanjang24[] ppArray = new PersegiPanjang24[3];

        //Konstruktor default pada indeks ke 0
        ppArray[0] = new PersegiPanjang24();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        //Konstruktor default pada indeks ke 1
        ppArray[1] = new PersegiPanjang24();
        ppArray[1].panjang = 110;
        ppArray[1].lebar = 30;

        //Konstruktor default pada indeks ke 2
        ppArray[2] = new PersegiPanjang24();
        ppArray[2].panjang = 110;
        ppArray[2].lebar = 30; 

        //Cetak semua array
        System.out.println("Persegi panjang ke - 0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi panjang ke - 0, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi panjang ke - 0, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);

        input24.close();
    }
}