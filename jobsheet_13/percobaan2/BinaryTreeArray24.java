package percobaan2;
public class BinaryTreeArray24 {
    int[] data;
    int idxLast;

    public BinaryTreeArray24() {
        data = new int[10];
    }

    void populateDate(int dt[], int idxL) {
        data = dt;
        idxLast = idxL;
    }

    void tranverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            tranverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            tranverseInOrder(2*idxStart + 2);
        }
    }
}