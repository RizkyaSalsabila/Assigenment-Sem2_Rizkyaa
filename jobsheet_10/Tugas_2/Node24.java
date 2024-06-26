package Tugas_2;

public class Node24 {
    //atribut
    Film24 data;
    Node24 prev;
    Node24 next;
    
    //konstruktor berparameter
    Node24(Node24 p, Film24 data , Node24 n) {
        prev = p;
        this.data = data;
        next = n;
    }
}