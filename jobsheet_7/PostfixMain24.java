import java.util.Scanner;

public class PostfixMain24 {
    public static void main(String[] args) {
        //Deklarasi Scanner sc
        Scanner sc = new Scanner(System.in);
        //Variabel P, Q
        String P, Q;
        //Input Q
        System.out.print("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix24 post = new Postfix24(total);
        P = post.konversi(Q);
        System.out.println("\n-------HASIL-------");
        System.out.println("Postfix : " + P);
        sc.close();
    }
}