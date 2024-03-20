public class Faktorial24 {
    //Atribut
    public int nilai;

    //method faktorialBF()
    int faktorialBF (int n) {
        /* PERULANGAN FOR
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;       //cetak fakto
        */

        //PERULANGAN WHILE
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        } return fakto;
    }

    //method faktorialDC()
    int faktorialDC (int n) {
        if (n == 1) {
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}