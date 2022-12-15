package ListProject;

public class List {
    
    public Node head;
    public Node tail;
    
    public class Node {
        public Node next;
        public Node prev;
        public int value;
        }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }
           
    public void revert() {
        Node node = head;
        while (node != null) {
            Node temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = temp;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
