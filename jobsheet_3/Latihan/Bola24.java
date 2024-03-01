public class Bola24 {
    public int jari;

    public Bola24(int r) {
        jari = r;
    }

    public double hitungVB() {
        //rumus : 4/3 * phi * r * r * r
        double vol = 0;
        vol = 4.0/3.0 * 3.14 * jari * jari * jari;

        return vol;
    }

    public double hitungLPBola() {
        //rumus : 4 * phi * r * r
        double lp = 0;
        lp = 4 * 3.14 * jari * jari;

        return lp;
    }
}