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
        System.out.println("\n-----------------------------");

        //PERCOBAAN 2
        System.out.println("=== CATATAN : Indeks dimulai dari 0, dan data dimulai dari 1 ===\n");

        //panggil method getData
        System.out.println("Data pada indeks ke - 1 / data ke - 2 adalah " + singLL.getData(1));
        System.out.println("\n-----------------------------");

        //panggil method indexOf
        System.out.println("Data 5 '760' berada pada indeks ke - " + singLL.indexOf(760));
        System.out.println("\n-----------------------------");

        //panggil method remove
        System.out.println("Isi Data '999' dihapus : ");
        singLL.remove(999);
        singLL.print();
        System.out.println("\n-----------------------------");

        //panggil method removeAt
        System.out.println("Indeks ke - 0 '700' dihapus : ");
        singLL.removeAt(0);
        singLL.print();
        System.out.println("\n-----------------------------");
        
        //panggil method removeFirst
        System.out.println("Indeks yang paling awal '890' dihapus : ");
        singLL.removeFirst();
        singLL.print();
        System.out.println("\n-----------------------------");

        //panggil method removeLast
        System.out.println("Indeks yang paling terakhir '760' dihapus : ");
        singLL.removeLast();
        singLL.print();
        System.out.println("\n-----------------------------");
    }
}