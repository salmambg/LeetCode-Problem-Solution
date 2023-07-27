public class removeSolution {
    public Node removeElements (Node head, int val) {
        if (head == null) {
            return null;
        }
        Node newHead = removeElements(head.next,val);
            if (head.value == val) {
                return newHead;
            }
            head.next = newHead;
            return head;
    }
}
