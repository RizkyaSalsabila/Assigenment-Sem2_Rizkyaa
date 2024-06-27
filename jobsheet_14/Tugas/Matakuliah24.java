package Tugas;

public class Matakuliah24 {
    //atribut
    String kode, namaMatkul;
    int sks;

    public Matakuliah24(String kd, String namaMataKuliah, int SKS) {
        kode = kd;
        namaMatkul = namaMataKuliah;
        sks = SKS;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
       return "Mata Kuliah {" + "kode : " + kode + ", nama mata kuliah : " + namaMatkul + ", sks : " + sks + "}";
    }
}
