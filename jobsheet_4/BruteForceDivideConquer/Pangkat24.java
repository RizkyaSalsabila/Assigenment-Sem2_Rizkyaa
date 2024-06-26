public class Pangkat24 {
    //Atribut
    public int nilai, pangkat;

    public Pangkat24(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    //method PangkatBF()
    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    //method pangkatDC() 
    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n%2 == 0) {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
            }
        }
    }
}
