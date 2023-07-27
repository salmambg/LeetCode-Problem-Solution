public class nodeSolution {
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
        return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
    public boolean isaPalindrome(Node head, Node reverseHead) {
        Node p1 = head;
        Node p2 = reverseHead;
        while (p1 != null && p2 != null) {
            if (p1.value != p2.value) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;

    }

}
