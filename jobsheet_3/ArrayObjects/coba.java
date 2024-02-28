public class MainPersegiPanjang24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in); 
        //Instansiasi ppArray dengan panjang 3
        PersegiPanjang24[] ppArray = new PersegiPanjang24[3];

        //Looping untuk mengisi panjang dan lebar
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang24();
            System.out.println("Persegi panjang ke - " + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = input24.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = input24.nextInt();
            System.out.println(" ");
        }
        System.out.println("------------------------");
        System.out.println("Hasil Tampilan :");

        //Looping untuk mengakses dan menampilkan ppArray
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke - " + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
            System.out.println(" ");
        }
        //Konstruktor default pada indeks ke 0
        /*ppArray[0] = new PersegiPanjang24();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        //Konstruktor default pada indeks ke 1
        ppArray[1] = new PersegiPanjang24();
        ppArray[1].panjang = 110;
        ppArray[1].lebar = 30;

        //Konstruktor default pada indeks ke 2
        ppArray[2] = new PersegiPanjang24();
        ppArray[2].panjang = 110;
        ppArray[2].lebar = 30; */

        //Cetak semua array
        System.out.println("Persegi panjang ke - 0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi panjang ke - 0, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi panjang ke - 0, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
    }
}

