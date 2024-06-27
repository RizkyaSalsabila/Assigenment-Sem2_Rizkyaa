package Tugas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main24 {
    //method menu()
    public static void menu() {
        System.out.println("****************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("****************************");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Keluar");
        System.out.println("****************************");
        System.out.print("Pilih (1/2/3/4/5) : ");
    }
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Deklarasi Banyak List
        List<Mahasiswa24> dataMahasiswa = new ArrayList<>();
        List<Matakuliah24> dataMatakuliah = new ArrayList<>();
        List<Nilai24> dataNilai = new ArrayList<>();

        //Input Data Mahasiswa
        // System.out.println("DATA MAHASISWA");
        // System.out.println("****************************");
        dataMahasiswa.add(new Mahasiswa24("20001", "Thalhah", "021xxx"));
        dataMahasiswa.add(new Mahasiswa24("20002", "Zubair", "021xxx"));
        dataMahasiswa.add(new Mahasiswa24("20003", "Abdur-Rahman", "021xxx"));
        dataMahasiswa.add(new Mahasiswa24("20004", "Sa'ad", "021xxx"));
        dataMahasiswa.add(new Mahasiswa24("20005", "Sa'id", "021xxx"));

        //Input Data Matakuliah
        // System.out.println("DATA MATA KULIAH");
        // System.out.println("****************************");
        dataMatakuliah.add(new Matakuliah24("0001", "Internet of Things", 3));
        dataMatakuliah.add(new Matakuliah24("0002", "Algoritma dan Struktur Data", 2));
        dataMatakuliah.add(new Matakuliah24("0003", "Algoritma dan Pemrograman", 2));
        dataMatakuliah.add(new Matakuliah24("0004", "Praktikum Algoritma dan Struktur Data", 3));
        dataMatakuliah.add(new Matakuliah24("0005", "Praktikum Algoritma dan Pemrograman", 3));

        

        int pilih;
        do {
            menu();
            pilih = input24.nextInt();
            input24.nextLine();

            switch (pilih) {
                case 1:
                    // Kode Input Nilai
                    System.out.println("\nDAFTAR MATA KULIAH ");
                    System.out.println("****************************");
                    for (Matakuliah24 mk : dataMatakuliah) {
                        System.out.println(mk.toString());
                    }
                    System.out.println("\n----------------------");
                    System.out.print("Input Kode : ");
                    String kodeMataKuliah = input24.nextLine();

                    Matakuliah24 mataKuliahTerpilih = null;
                    for (Matakuliah24 mk : dataMatakuliah) {
                        if (mk.getKode().equals(kodeMataKuliah)) {
                            mataKuliahTerpilih = mk;
                            break;
                        }
                    }

                    if (mataKuliahTerpilih == null) {
                        System.out.println("Kode Mata Kuliah tidak ditemukan.");
                        break;
                    }

                    System.out.print("Input Nilai : ");
                    Double nilai = input24.nextDouble();
                    input24.nextLine(); 
                    System.out.println("----------------------"); 

                    System.out.println("\nDAFTAR MAHASISWA ");
                    System.out.println("****************************");
                    for (Mahasiswa24 mhs : dataMahasiswa) {
                        System.out.println(mhs.toString());
                    }
                    System.out.println("\n----------------------");
                    System.out.print("Input NIM : ");
                    String nimMahasiswa = input24.nextLine();
                    System.out.println("----------------------\n");
    
                    Mahasiswa24 mahasiswaTerpilih = null;
                    for (Mahasiswa24 mhs : dataMahasiswa) {
                        if (mhs.getNim().equals(nimMahasiswa)) {
                            mahasiswaTerpilih = mhs;
                            break;
                        }
                    }
    
                    if (mahasiswaTerpilih == null) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                        break;
                    }

                    // Menambahkan nilai ke daftar nilai
                    dataNilai.add(new Nilai24(mahasiswaTerpilih, mataKuliahTerpilih, nilai));
                    break;
                case 2:
                    //Kode Tampil Nilai
                    System.out.println("\nDaftar Nilai Mahasiswa:");
                    System.out.println("--------------------------------------------------------------");
                    System.out.printf("| %-12s | %-20s | %-25s | %-4s | %-5s |\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    System.out.println("--------------------------------------------------------------");
                    for (Nilai24 nilaiMahasiswa : dataNilai) {
                        Mahasiswa24 mhs = nilaiMahasiswa.getMahasiswa();
                        Matakuliah24 mk = nilaiMahasiswa.getMatkul();
                        System.out.printf("| %-12s | %-20s | %-25s | %-4d | %-5.1f |\n", mhs.getNim(), mhs.getNama(), mk.getNamaMatkul(), mk.getSks(), nilaiMahasiswa.getNilai());
                    }
                    System.out.println("--------------------------------------------------------------");
                    break;
                case 3:
                     // Kode Cari Nilai Mahasiswa
                     System.out.println("\nDaftar Nilai Mahasiswa:");
                     System.out.println("--------------------------------------------------------------");
                     System.out.printf("| %-12s | %-20s | %-25s | %-4s | %-5s |\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                     System.out.println("--------------------------------------------------------------");
                     for (Nilai24 nilaiMahasiswa : dataNilai) {
                         Mahasiswa24 mhs = nilaiMahasiswa.getMahasiswa();
                         Matakuliah24 mk = nilaiMahasiswa.getMatkul();
                         System.out.printf("| %-12s | %-20s | %-25s | %-4d | %-5.1f |\n", mhs.getNim(), mhs.getNama(), mk.getNamaMatkul(), mk.getSks(), nilaiMahasiswa.getNilai());
                     }
                     System.out.println("--------------------------------------------------------------");
 
                     System.out.print("Masukkan NIM Mahasiswa untuk mencari nilai: ");
                     String cariNim = input24.nextLine();
 
                     boolean found = false;
                     for (Nilai24 nilaiMahasiswa : dataNilai) {
                         Mahasiswa24 mhs = nilaiMahasiswa.getMahasiswa();
                         if (mhs.getNim().equals(cariNim)) {
                             System.out.println("Data Mahasiswa:");
                             System.out.println(mhs.toString());
                             found = true;
                             break;
                         }
                     }
 
                     if (!found) {
                         System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                     }
                     break;
                case 4:
                 //Kode Urut Data Nilai (ascending)
                    Collections.sort(dataNilai, new Comparator<Nilai24>() {
                        @Override
                        public int compare(Nilai24 nilai1, Nilai24 nilai2) {
                            // Membandingkan berdasarkan NIM mahasiswa
                            return nilai1.getMahasiswa().getNim().compareTo(nilai2.getMahasiswa().getNim());
                        }
                    });

                    System.out.println("\nDaftar Nilai Mahasiswa setelah diurutkan (descending):");
                    System.out.println("--------------------------------------------------------------");
                    System.out.printf("| %-12s | %-20s | %-25s | %-4s | %-5s |\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    System.out.println("--------------------------------------------------------------");
                    for (Nilai24 nilaiMahasiswa : dataNilai) {
                        Mahasiswa24 mhs = nilaiMahasiswa.getMahasiswa();
                        Matakuliah24 mk = nilaiMahasiswa.getMatkul();
                        System.out.printf("| %-12s | %-20s | %-25s | %-4d | %-5.1f |\n", mhs.getNim(), mhs.getNama(), mk.getNamaMatkul(), mk.getSks(), nilaiMahasiswa.getNilai());
                    }
                    System.out.println("--------------------------------------------------------------");
                    break;
                case 5:
                //Kode Keluar
                    System.out.println("Anda keluar dari sistem");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println("Silahkan input menu yang sesuai...");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    input24.close();
    }

    //Effort pada nomer 2, tapi error
    //Jadi, dikomen dulu...
    // public static void hapusMahasiswa(Scanner scanner) {
    //     System.out.println("DAFTAR MAHASISWA");
    //     System.out.println("**************************************************");
    //     System.out.println("NIM\tNama\tTelepon");
    //     for (Mahasiswa24 m : daftarMahasiswa) {
    //         System.out.println(m);
    //     }
    //     System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
    //     String nim = scanner.next();

    //     queueHapusMahasiswa.add(nim);
    //     System.out.println("Mahasiswa berhasil ditambahkan ke dalam antrian untuk dihapus.");

    //     // Proses penghapusan
    //     while (!queueHapusMahasiswa.isEmpty()) {
    //         String nimHapus = queueHapusMahasiswa.poll();
    //         Mahasiswa24 mahasiswa = cariMahasiswa(nimHapus);

    //         if (mahasiswa != null) {
    //             dataMahasiswa.remove(mahasiswa);
    //             System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
    //             // Hapus nilai mahasiswa tersebut
    //             daftarNilai.removeIf(nilai -> nilai.getMahasiswa().equals(mahasiswa));
    //         } else {
    //             System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
    //         }
    //     }
    // }
}