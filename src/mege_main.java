public class mege_main {
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next= new Node(5);
        head.next.next.next.next.next.next= new Node(2);
        head.next.next.next.next.next.next.next= new Node(0);

        Mege_node node = new Mege_node();
        Node merged = node.mergeNodes(head);
        Node current = merged;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
