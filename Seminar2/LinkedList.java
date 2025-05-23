public class LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
         }
    }

    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) return;

        if(head.data == data) {
            head = head.next;
        }

        Node currentNode = head;
        while(currentNode.next !=null) {
            if(currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }

    public void display() {
        Node currentNode = head;
        while(currentNode !=null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(10);
        l.add(20);
        l.add(15);
        l.delete(20);
        l.display();
    }
}
