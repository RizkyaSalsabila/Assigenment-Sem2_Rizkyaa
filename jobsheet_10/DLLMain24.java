public class DLLMain24 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList24 dll = new DoubleLinkedList24();

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
    }
}