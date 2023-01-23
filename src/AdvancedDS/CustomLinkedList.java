package AdvancedDS;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    protected int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        size--;
        //temp = null;
    }
//    public void delete( int index){
//         Node node = new Node(2);
//         Node temp = head;
//        for (int i = 0; i < index; i++) {
//            node.next = temp.next.next;
//        }
//        size--;
//    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void getSize(){
        System.out.println(size);
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
        list.deleteFirst();
        //list.delete(2);

        list.display();
        list.getSize();
    }
}