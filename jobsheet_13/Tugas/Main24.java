package Tugas;

public class Main24 {
    public static void main(String[] args) {
        //pemanggilan class binaryTreeArray24
        BinaryTreeArray24 tree = new BinaryTreeArray24();

        tree.add(9);
        tree.add(5);
        tree.add(6);
        tree.add(2);
        tree.add(3);
        tree.add(4);

        System.out.println("= CLASS BINARY TREE ARRAY =");
        System.out.println("-------------------------------");
        System.out.print("PreOrder Traversal   : ");
        tree.tranversePreOrder(0);
        System.out.println("");
        System.out.println("\n-------------------------------");
        System.out.print("InOrder Traversal   : ");
        tree.tranverseInOrder(0);
        System.out.println("");
        System.out.println("-\n------------------------------");
        System.out.print("PostOrder Traversal : ");
        tree.tranversePostOrder(0);
        System.out.println("");


        //pemanggilan class binaryTree24
        BinaryTree24 tr = new BinaryTree24();

        tr.add(9);
        tr.add(5);
        tr.add(6);
        tr.add(2);
        tr.add(3);
        tr.add(4);

        System.out.println("\n\n= CLASS BINARY TREE =");
        System.out.println("Tampilkan nilai paling kecil : " + tr.cariMin());
        System.out.println("Tampilkan nilai paling besar : " + tr.cariMax());
        System.out.print("Data Leaf node yakni : ");
        tr.printLeafNodes();
        System.out.println("\nJumlah leaf pada tree : " + tr.hitungNode());
       
    }
}
