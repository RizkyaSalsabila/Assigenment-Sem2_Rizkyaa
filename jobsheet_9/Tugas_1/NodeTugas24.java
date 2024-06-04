package Tugas_1;

public class NodeTugas24 {
    //atribut
    MahasiswaSLL24 data;
    NodeTugas24 next;

    //konstruktor berparameter
    public NodeTugas24(MahasiswaSLL24 mhs, NodeTugas24 berikutnya) {
        data = mhs;
        next = berikutnya;
    }
}