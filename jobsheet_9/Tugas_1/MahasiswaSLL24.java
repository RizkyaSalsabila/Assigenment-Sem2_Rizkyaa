package Tugas_1;

public class MahasiswaSLL24 {
    //atribut
    String nim, nama;
    
    //konstruktor default
    public MahasiswaSLL24() {

    }

    //konstruktor berparameter
    public MahasiswaSLL24(String n, String nm) {
        nim = n;
        nama = nm;
    }

    //method untuk mencetak
    public void print() {
        System.out.print("NIM : " + nim + ", ");
        System.out.println("Nama " + nama);
    }
}