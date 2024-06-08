package percobaan3;

public class Mahasiswa24 {
    //atribut
    String nim, nama, telp;

    //konstruktor default
    public Mahasiswa24() {

    }

    //Konstruktor berparameter
    public Mahasiswa24(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim : " + nim + ", nama : " + nama + ", notelp : " + telp + "}";
    }
}
