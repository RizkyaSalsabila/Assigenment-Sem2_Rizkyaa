public class LimasS4SamaSisi24 {
    int sisiAlas;
    int tinggi;

    LimasS4SamaSisi24 (int a, int t) {
        sisiAlas = a;
        tinggi = t;
    }

    public double hitungVL() {
        //rumus : 1/3 * luas alas * tinggi 
        //atau     1/3 * panjang * lebar * tinggi
        double vol = 0;
        vol = (Math.pow(sisiAlas, 2) * tinggi) / 3;

        return vol;
    }

    public double hitungLPLimas() {
        //rumus : Luas alas + (4 * luas segitiga)
        //        (panjang * lebar) + (4 * (1/2 * alas * tinggi))
        double lp = 0;
        double luasAlas = Math.pow(sisiAlas, 2);
        double luasSegitiga = (sisiAlas * tinggi) / 2;
        lp = luasAlas + 4 * luasSegitiga;

        return lp;
    }
}