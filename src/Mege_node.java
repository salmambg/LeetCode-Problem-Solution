public class Mege_node {
    public Node mergeNodes(Node head) {
        Node dummyNode = new Node();
        Node pointer = dummyNode;
        Node temp = head;
        temp = temp.next;

        int sum = 0;
        while (temp != null) {
            while (temp.value != 0) {
            sum += temp.value;
            temp = temp.next;
            }
            pointer.next = new Node(sum);
            pointer = pointer.next;
            temp = temp.next;
            sum = 0;
        }
        return dummyNode.next;
    }

}
