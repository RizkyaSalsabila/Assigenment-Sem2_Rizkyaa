public class DoubleLinkedList24 {
    Node24 head;
    int size;

    DoubleLinkedList24(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if(isEmpty()){
            head = new Node24(null, item, jarak, null);
        } else {
            Node24 newNode = new Node24(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }

        Node24 tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void updateJarak(int tujuan, int jarak) {
        Node24 temp = head;
        while (temp != null) {
            if (temp.data == tujuan) {
                temp.jarak = jarak;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Edge tidak ditemukan.");
    }

    public void addLast (int item, int jarak){
        if(isEmpty()){
            addFirst(item, jarak);
        } else {
            Node24 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node24 newNode = new Node24(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item,  int jarak, int index) throws Exception {
        if(isEmpty()){
            addFirst(item, jarak);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node24 current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            } 
            if(current.prev == null){
                Node24 newNode = new Node24(null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node24 newNode = new Node24(current.prev, item, jarak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            Node24 tmp = head;
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }

        Node24 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int tujuan) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }

        Node24 current = head;
        while (current != null) {
            if (current.data == tujuan) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                return;  // Keluar setelah menghapus satu elemen yang sesuai
            }
            current = current.next;
        }
        throw new Exception("Node dengan tujuan " + tujuan + " tidak ditemukan");
    }

    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        } 
        Node24 tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node24 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

}
