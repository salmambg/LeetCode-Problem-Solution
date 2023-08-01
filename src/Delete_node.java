public class Delete_node {
    public Node middleNode(Node head, Node node) {
       node.value = node.next.value;
       node.next = node.next.next;
       return head;

    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        Node node = head.next;

        Delete_node dn = new Delete_node();
        Node result = dn.middleNode(head,node);
        Node current = result;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
