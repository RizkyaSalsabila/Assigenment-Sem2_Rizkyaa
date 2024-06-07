package percobaan1;

//jenis import yang digunakan
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList24 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<> ();
        l.add(1);
        l.add(2);
        l.add(3);
        //l.add("Cireng");
        l.add(5);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));


        //List<String> names = new LinkedList<>();
        LinkedList<String> names = new LinkedList<> ();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
       
        names.set(0, "My kid");
        System.out.printf("\nElemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());

        //soal no 4
        names.push("Mei - mei");
        System.out.printf("\nElemen 0: %s total elemen: %s elemen terakhir: %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
    }   
}