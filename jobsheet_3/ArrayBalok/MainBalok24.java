public class MainBalok24 {
    public static void main(String[] args) {
        //Instansiasi array blArray
        Balok24[] blArray = new Balok24[3];

        //Isi konstruktor berparameter
        blArray[0] = new Balok24(100, 30, 12);
        blArray[1] = new Balok24(120, 40, 15);
        blArray[2] = new Balok24(210, 50, 25);
    
        for(int i = 0; i < 3; i++) {
            System.out.println("Volume Balok ke - " + i + " : " + blArray[i].hitungVolume());
        }
    }
}