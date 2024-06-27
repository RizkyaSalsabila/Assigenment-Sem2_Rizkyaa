import java.util.Scanner;

public class GraphMain24 {
     public static void main(String[] args) throws Exception{
        Scanner input24 = new Scanner(System.in);
        Graph24 gedung = new Graph24(6);
        boolean graph = true;

        while(graph){
            System.out.println("==========================");
            System.out.println("           GRAPH         ");
            System.out.println("==========================");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak Edge");
            System.out.println("7. Hitung jumlah Edge dalam graph");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = input24.nextInt();

            switch(pilihan){
                case 1: 
                    System.out.print("Masukkan Asal Edge: ");
                    int asal = input24.nextInt();
                    System.out.print("Masukkan Tujuan Edge: ");
                    int tujuan = input24.nextInt();
                    System.out.print("Masukkan Jarak Edge: ");
                    int jarak = input24.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    System.out.println("Edge baru telah dimasukkan!!");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("1. Hapus semua Edge");
                    System.out.println("2. Hapus edge tertentu");
                    System.out.print("Masukkan pilihan Anda: ");
                    pilihan = input24.nextInt();

                    switch(pilihan){
                        case 1:
                            gedung.removeAllEdges();
                            System.out.println("Semua Edge Telah dihapus!");
                            break;
                        
                        case 2:
                            System.out.println("Masukkan Edge yang ingin Anda Hapus");
                            System.out.print("Asal Edge: ");
                            asal = input24.nextInt();
                            System.out.print("Tujuan Edge: ");
                            tujuan = input24.nextInt();
                            gedung.removeEdge(asal, tujuan);
                            System.out.println("Edge berhasil dihapus!!");
                            break;

                        default:
                            System.out.println("Pilihan Anda tidak valid");
                            break;
                    }
                    break;

                case 3:
                    System.out.print("Masukkan degree yang ingin Anda cari: ");
                    int degree = input24.nextInt();
                    gedung.degree(degree);
                    break;

                case 4:
                    System.out.println("Daftar Graph: ");
                    gedung.printGraph();
                    break;

                case 5:
                    System.out.println("Cek Edge: ");
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = input24.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = input24.nextInt();
                    gedung.cekGraph(asal, tujuan);
                    break;

                case 6:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = input24.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = input24.nextInt();
                    System.out.print("Masukkan Jarak Baru: ");
                    jarak = input24.nextInt();
                    gedung.updateJarak(asal - 1, tujuan - 1, jarak);
                    System.out.println("Jarak baru telah di update!");
                    break;

                case 7: 
                    System.out.println("Menghitung jumlah edge dalam graph...");
                    int edgeCount = gedung.hitungEdge();
                    System.out.println("Jumlah edge dalam graf: " + edgeCount);
                    break;

                case 8: 
                    graph = false;
                    break;

                default:
                    System.out.println("Pilihan Anda tidak valid.");
                    break;
            }
        }
    }
}