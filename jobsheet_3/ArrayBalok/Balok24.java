public class Balok24 {
    //Atribut
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok24(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}