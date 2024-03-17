package ArraySegitiga;

public class Segitiga24 {
    //Atribut
    public int alas;
    public int tinggi;

    //Konstruktor berparameter
    public Segitiga24(int a, int t) {
        alas = a;
        tinggi = t;
    }

    //method hitungLuas
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    //method hitungKeliling
    public double hitungKeliling() {
        double kel = 0;
        double sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        kel = alas + tinggi + sisiMiring;

        return kel;
    }
}