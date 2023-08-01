public class Delete_midNode {
    public Node deleteMid (Node head) {
        if(head == null || head.next == null)
            return null;
        Node fast = head;
        Node slow = head;
        Node pre = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast .next.next;
        }
        pre.next = pre.next.next;
        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next= new Node(2);
        head.next.next.next.next.next.next= new Node(6);


        Delete_midNode dn = new Delete_midNode();
        Node result = dn.deleteMid(head);
        Node current = result;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
