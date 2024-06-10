package Tugas_1;

public class Node24 {
    //atribut
    Orang24 data;
    Node24 prev;
    Node24 next;

    Node24() {
        
    }
    //konstruktor berparameter
    Node24(Node24 p, Orang24 dt, Node24 n) {
        prev = p;
        data = dt;
        next = n;
    }
}
