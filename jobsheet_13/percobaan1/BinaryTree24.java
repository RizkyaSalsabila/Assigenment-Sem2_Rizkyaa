package percobaan1;
public class BinaryTree24 {
    //atribut
    Node24 root;

    //Konstruktor default
    public BinaryTree24() {
        root = null;
   } 

    //method untuk mengecek kekosongan 'isEmpty'
    boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    //method untuk menambahkan data dengan tidak rekursif 'add'
    void add(int data) {
        if (isEmpty()) { //ganti isEmpty()
            root = new Node24(data);
        } else {
            Node24 current = root;
            while (true) {
                //kode benar
                if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node24(data);
                        break;
                    }
                } else if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node24(data);
                        break;
                    }
                }  else {
                    break;
                }
            }
        }
    }

    //method untuk mencari data 'find'
    boolean find(int data) {
        boolean result = false;
        Node24 current = root;
        while (current != null) {       //bukan current == null, tetapi current != null 
            if (current.data == data) { //bukan != data, tetapi == data
                result = true;
                break;
            } else if (data > current.data) {
                current = current.right;    //bukan current.left, tetapi current.right
            } else {
                current = current.left;     //bukan current.right, tetapi current.left
            }
        }
        return result;
    }

    //method untuk menstranverse posisi parent di awal 'tranversePreOrder'
    void tranversePreOrder(Node24 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }
    //method untuk menstranverse posisi parent di akhir 'tranversePostOrder'
    void tranversePostOrder(Node24 node) {
        if (node != null) {
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    //method untuk menstranverse posisi parent di tengah 'tranverseInOrder'
    void tranverseInOrder(Node24 node) {
        if (node != null) {
            tranverseInOrder(node.left);
            System.out.print(" " + node.data);
            tranverseInOrder(node.right);
        }
    }

    //method untuk penghapusan node 2 child 'getSuccessor'
    Node24 getSuccessor(Node24 del) {
        Node24 successor = del.right;
        Node24 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    //method untuk menghapus node 'delete'
    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree masih kosong!");
            return;
        }
        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Tidak ditemukan data");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                } 
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }          
            } else {
                Node24 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}