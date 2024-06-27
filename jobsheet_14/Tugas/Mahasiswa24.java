package Tugas;

public class Mahasiswa24 {
    //atribut
    String nim, nama, telp;

    //Konstruktor berparameter
    public Mahasiswa24(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telp;
    }

    @Override
    public String toString() {
        return "Mahasiswa {" + "nim : " + nim + ", nama : " + nama + ", notelp : " + telp + "}";
    }
}
