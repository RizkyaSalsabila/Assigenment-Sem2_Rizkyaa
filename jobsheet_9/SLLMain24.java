public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 singLL = new SingleLinkedList24();

        System.out.println("-----------------------------");
        System.out.println("Data Kosong : ");
        singLL.print();
        System.out.println("\n-----------------------------");

        //panggil method addFirst
        System.out.println("Data '890' ditambah di awal : ");
        singLL.addFirst(890);
        singLL.print();
        System.out.println("\n-----------------------------");

        //panggil method addLast
        System.out.println("Data '760' ditambah di akhir : ");
        singLL.addLast(760);
        singLL.print();
        System.out.println("\n-----------------------------");

        //panggil method addFirst
        System.out.println("Data '700' ditambah di paling awal : ");
        singLL.addFirst(700);
        singLL.print();
        System.out.println("\n-----------------------------");

        //panggil method insertAfter
        System.out.println("Data '999' ditambah setelah 700 : ");
        singLL.insertAfter(700, 999);
        singLL.print();
        System.out.println("\n-----------------------------");
        
        //panggil method insertAt
        System.out.println("Data '833' ditempatkan ke indeks 3 : ");
        singLL.insertAt(3, 833);
        singLL.print();
    }
}