import java.util.Scanner;
public class MainBangunRuang24 {
    
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        Kerucut24[] krc = new Kerucut24[3];
        LimasS4SamaSisi24[] lim = new LimasS4SamaSisi24[3];
        Bola24[] bl = new Bola24[1];

        //Input semua bangun ruang
        for (int i = 0; i < 3; i++) {
            //Input Kerucut
            System.out.println("\nKerucut ke - " + i);
            System.out.print("Jari kerucut : ");
            int jariKerucut = input24.nextInt();
            System.out.print("Tinggi kerucut : ");
            int tKerucut = input24.nextInt();
            //Instansiasi
            krc[i] = new Kerucut24(jariKerucut, tKerucut);

            //Input Limas
            System.out.println("\nLimas ke - " + i);
            System.out.print("Sisi Alas limas : ");
            int alasLimas = input24.nextInt();
            System.out.print("Tinggi Limas : ");
            int tinggiLimas = input24.nextInt();
            //Instansiasi 
            lim[i] = new LimasS4SamaSisi24(alasLimas, tinggiLimas);

            //Input Bola
            System.out.println("\nBola ke - " + i);
            System.out.print("Jari jari : ");
            int jariBola = input24.nextInt();
            //Instansiasi 
            bl[i] = new Bola24(jariBola);
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Hasil Perhitungan");
        System.out.println("----------------------------------------");

        //Menampilkan bangun ruang kerucut
        for (int i = 0; i < krc.length; i++) {
            System.out.println("\nKerucut ke -" + i);
            //System.out.println("Volume Kerucut : " + krc[i].hitungVK());
            System.out.printf("Volume Kerucut : %.2f", krc[i].hitungVK());
            System.out.printf("\nLuas Permukaan Kerucut : %.2f\n", krc[i].hitungLPKerucut());
        }

        //Menampilkan bangun ruang limas
        for (int i = 0; i < lim.length; i++) {
            System.out.println("\nLimas Segi Empat Sisi ke -" + i);
            System.out.printf("Volume Limas Segi Empat Sisi : %.2f", lim[i].hitungVL());
            System.out.printf("\nLuas Permukaan Limas Segi Empat Sisi : %.2f\n", lim[i].hitungLPLimas());
        }

         //Menampilkan bangun ruang bola
         for (int i = 0; i < bl.length; i++) {
            System.out.println("\nBola ke -" + i);
            System.out.printf("Volume Bola : %.2f", bl[i].hitungVB());
            System.out.printf("\nLuas Permukaan Bola : %.2f\n", bl[i].hitungLPBola());
        }
        maxVol(krc);

        input24.close();
    }

    //Volume terbesar
    static void maxVol(Kerucut24[] krc) {       //alasan menggunakan static agar bisa langsung dipanggil di main, tanpa memanggil object
        double maxVol = krc[0].hitungVK();    //mula mula volume terbesar adalah indeks ke 0
        int maxVolIdx = 0;          //digunakan untuk menyimpan indkes
        for (int i = 1; i < 3; i++) {
            if (krc[i].hitungVK() > maxVol) {
                maxVol = krc[i].hitungVK();
                maxVolIdx = i;
            }
        }

        System.out.println("Max Volume : " + maxVol);
        System.out.println("Jari jari : " + krc[maxVolIdx].jari);
        System.out.println("Sisi miring : " + krc[maxVolIdx].sisiMiring);
    }
    
}