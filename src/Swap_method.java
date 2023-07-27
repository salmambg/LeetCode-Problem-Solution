public class Swap_method {
    public Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node first = head;
        Node second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }
}
