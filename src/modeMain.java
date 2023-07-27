public class modeMain {
    public static void main(String[] args) {
       Node head = new Node (1);
        head.next = new Node (2);
        head.next.next = new Node (3);
        head.next.next.next = new Node (4);
        head.next.next.next.next = new Node (5);

        nodeSolution solution = new nodeSolution();

        Node reverseHead = solution.reverseList(head);

        System.out.println("Reversed linked list:");

        Node current = reverseHead;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
