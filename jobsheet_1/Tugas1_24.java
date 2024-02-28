import java.util.Scanner;
public class Tugas1_24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},  
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}  
        };

        System.out.print("Masukkan Kode Plat Nomor : ");
        char kodePlat = input24.next().charAt(0); 

        int index = 0;
        for (char cariIndex: kode) {
            if (cariIndex == kodePlat) {
                break;
            }
            index++;
        }

        System.out.print("Kode tersebut merupakan plat nomor Kota : ");
        for (char kotaIndex: kota[index]) {
            System.out.print(kotaIndex);
        }
        System.out.println("");

        input24.close();
    }
}