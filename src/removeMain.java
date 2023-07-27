public class removeMain {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next= new Node(5);
        head.next.next.next.next.next.next= new Node(6);

        removeSolution solution = new removeSolution();
        Node result = solution.removeElements(head,6);
        Node current = result;

        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");

    }
}
