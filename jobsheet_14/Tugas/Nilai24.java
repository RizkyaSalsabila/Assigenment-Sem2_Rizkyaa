package Tugas;

public class Nilai24 {
    //atribut
    Mahasiswa24 mahasiswa24;
    Matakuliah24 matakuliah24;
    Double nilai;

    //
    public Nilai24(Mahasiswa24 mhs, Matakuliah24 matkul, Double n) {
        mahasiswa24 = mhs;
        matakuliah24 = matkul;
        nilai = n;
    }

    public Mahasiswa24 getMahasiswa() {
        return mahasiswa24;
    }

    public Matakuliah24 getMatkul() {
        return matakuliah24;
    }

    public Double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
       return "Data {" + "mahasiswa : " + mahasiswa24 + ", mata kuliah : " + matakuliah24 + ", nilai : " + nilai + "}";
    }
}
