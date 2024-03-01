package ArraySegitiga;

public class MainSegitiga24 {
    public static void main(String[] args) {
        Segitiga24[] sgt = new Segitiga24[4];

        //Isi array setiap elemen
        sgt[0] = new Segitiga24(10, 4);
        sgt[1] = new Segitiga24(20, 10);
        sgt[2] = new Segitiga24(15, 6);
        sgt[3] = new Segitiga24(25, 10);

        for (int i = 0; i < sgt.length; i++) {
            System.out.println("\nSegitiga ke - " + i);
            System.out.printf("Luas Segitiga : %.2f\n", sgt[i].hitungLuas());
            System.out.printf("Keliling Segitiga : %.2f\n", sgt[i].hitungKeliling());
        }
    }
}