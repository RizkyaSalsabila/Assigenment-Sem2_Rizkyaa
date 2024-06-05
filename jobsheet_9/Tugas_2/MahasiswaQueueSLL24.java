package Tugas_2;

public class MahasiswaQueueSLL24 {
    //atribut
    String nim, nama;

    //konstruktor default
    MahasiswaQueueSLL24() {

    } 

    //konstruktor berparameter
    MahasiswaQueueSLL24(String n, String nm) {
        nim = n;
        nama = nm;
    }

    //method untuk mencetak
    public void print() {
        System.out.print("NIM : " + nim + ", ");
        System.out.println("Nama " + nama);
    }
}