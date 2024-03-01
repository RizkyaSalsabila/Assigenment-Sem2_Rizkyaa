public class Kerucut24 {
    public double jari;
    public double sisiMiring;

    Kerucut24(int r, int sm) {
        jari = r;
        sisiMiring = sm;
    }

    public double hitungVK() {
        double vol = 0;
        double luasAlas = 3.14 * jari * jari;

        //Keterangan : Math.pow digunakan untuk kuadrat
        //             Math.sqrt digunakan untuk akar kuadrat

        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jari, 2));
        vol = (luasAlas * tinggi) / 3;

        return vol;
    }

    public double hitungLPKerucut() {
        double lp = 0;
        lp = 3.14 * jari * (sisiMiring + jari);
        
        return lp;
    }
}