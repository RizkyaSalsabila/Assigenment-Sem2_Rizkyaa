import java.util.Scanner;
public class Perulangan24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.print("Masukkan NIM : ");
        String NIM = input24.nextLine();
        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));
        if (n < 10) {
            n += 10;
        }

        System.out.println("----------------------------------");

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 != 0) {
                System.out.print(" * ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        input24.close();
    }
}