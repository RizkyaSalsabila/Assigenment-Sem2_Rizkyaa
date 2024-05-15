public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll.addLast(75);
        dll.print();
        dll.printFromTail();

        //lanjutkan dengan memanggil method merge, split
        DoubleLinkedList dll1 = new DoubleLinkedList();
        System.out.println("DLL1");
        dll1.addFirst(20);
        dll1.addLast(60);
        dll1.print();
        System.out.println("---------------------------");

        DoubleLinkedList dll2 = new DoubleLinkedList();
        System.out.println("Data Sebelum di Merge");
        System.out.println("DLL2");
        dll2.addFirst(35);
        dll2.addLast(70);
        dll2.print();
        System.out.println("---------------------------");

        merge(dll1, dll2);
        System.out.println("Data setelah di merge");
        dll1.print();
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        //complete this method
        if (dll1.isEmpty()) {
            dll1.head = dll2.head;
            dll1.tail = dll2.tail;
        } else if (!dll2.isEmpty()) { 
            dll1.tail.n = dll2.head;
            dll2.head.p = dll1.tail;
            dll1.tail = dll2.tail;
        }

        dll1.size += dll2.size;

        dll2.head = null;
        dll2.tail = null;
        dll2.size = 0;

    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
