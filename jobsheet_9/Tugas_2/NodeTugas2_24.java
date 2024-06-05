package Tugas_2;

public class NodeTugas2_24 {
    //atribut
    MahasiswaQueueSLL24 data;
    NodeTugas2_24 next;

    //konstruktor berparameter
    public NodeTugas2_24(MahasiswaQueueSLL24 mhs, NodeTugas2_24 berikutnya) {
        data = mhs;
        next = berikutnya;
    }
}