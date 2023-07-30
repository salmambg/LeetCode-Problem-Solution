public class Middle_Node {
    public Node middleNode(Node head) {
        Node t1 = head;
        Node t2 = head;
        while (t2 != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return t1;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Middle_Node node = new Middle_Node();
        Node result = node.middleNode(head);
        Node current = result;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
