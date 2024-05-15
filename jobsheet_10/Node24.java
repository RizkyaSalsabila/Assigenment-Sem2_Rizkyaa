public class Node24 {
    //atribut
    int data;
    Node24 prev;
    Node24 next;
    
    //konstruktor berparameter
    Node24(Node24 prev, int data, Node24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}