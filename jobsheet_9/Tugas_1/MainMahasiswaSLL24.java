package Tugas_1;

public class MainMahasiswaSLL24 {
    public static void main(String[] args) {
        SLL24 sll = new SLL24();

        sll.addFirst(new MahasiswaSLL24("111", "Anton"));
        sll.insertAfter("111", new MahasiswaSLL24("112", "Prita"));
        sll.insertAfter("112", new MahasiswaSLL24("113", "Yusuf"));
        sll.insertAt(3, new MahasiswaSLL24("114", "Doni"));
        sll.addLast(new MahasiswaSLL24("115", "Sari"));
        sll.print();
    }
}