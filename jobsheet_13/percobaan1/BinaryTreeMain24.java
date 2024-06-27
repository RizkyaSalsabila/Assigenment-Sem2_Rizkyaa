package percobaan1;
public class BinaryTreeMain24 {
    public static void main(String[] args) {
        BinaryTree24 bt = new BinaryTree24();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println("-------------------------------");
        System.out.print("PreOrder Traversal   : ");
        bt.tranversePreOrder(bt.root);
        System.out.println("");
        System.out.println("\n-------------------------------");
        System.out.print("InOrder Traversal   : ");
        bt.tranverseInOrder(bt.root);
        System.out.println("");
        System.out.println("-\n------------------------------");
        System.out.print("PostOrder Traversal : ");
        bt.tranversePostOrder(bt.root);
        System.out.println("");
        System.out.println("\n-------------------------------");
        System.out.println("Cari data Node '5' : " + bt.find(5));
        System.out.println("\n-------------------------------");
        System.out.println("Delete Node '8'");
        bt.delete(8);
        System.out.println("");
        System.out.println("-------------------------------");    
        System.out.print("PreOrder Traversal : ");
        bt.tranversePreOrder(bt.root);
        System.out.println("");
    }    
}