public class DLLMain24 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList24 dll = new DoubleLinkedList24();

        /*PERCOBAAN 1 
        //panggil method 'print' yang belum terisi data
        dll.print();
        System.out.println("\nSize : " + dll.size());
        System.out.println("------------------------------");

        //panggil method addFirst
        System.out.println("Tambah data '3' di awal");
        dll.addFirst(3);
        dll.print();
        System.out.println("\nSize : " + dll.size());
        System.out.println("------------------------------");

        //panggil method addLast
        System.out.println("Tambah data '4' di akhir");
        dll.addLast(4);
        dll.print();
        System.out.println("\nSize : " + dll.size());
        System.out.println("------------------------------");
        
        //panggil method addFirst
        System.out.println("Tambah data '7' di awal");
        dll.addFirst(7);
        dll.print();
        System.out.println("\nSize : " + dll.size());
        System.out.println("------------------------------");

        //panggil method add
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");

        //panggil method clear
        dll.clear();
        dll.print();
        System.out.println("\nSize : " + dll.size());
        System.out.println("------------------------------");
        */

        //PERCOBAAN 2
        //panggil method 'print' yang belum terisi data
        dll.print();
        System.out.println("\nSize : " + dll.size());
        System.out.println("------------------------------");

        //panggil method addLast
        System.out.println("Tambah data '50' di akhir");
        dll.addLast(50);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");

        //panggil method addLast
        System.out.println("Tambah data '40' di akhir");
        dll.addLast(40);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");

        //panggil method addLast
        System.out.println("Tambah data '10' di akhir");
        dll.addLast(10);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");
        
        //panggil method addLast
        System.out.println("Tambah data '20' di akhir");
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");

        //panggil method removeFirst
        System.out.println("Penghapusan data awal '50'");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");

        //panggil method removeLast
        System.out.println("Penghapusan data akhir '20'");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");

        //panggil method remove
        System.out.println("Penghapusan data di indeks ke 1/data 2 '10'");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("------------------------------");
    }
}