public class return_node {
    public Node nodeReturn (Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                while (head != slow) {
                    head= head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // // Create a linked list [3, 2, 0, -4] with a cycle.
        Node node0= new Node(3);
        Node node1= new Node(2);
        Node node2= new Node(0);
        Node node3= new Node(-4);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // Create the cycle by connecting the last node to the second node.

        return_node rn = new return_node();
        Node result = rn.nodeReturn(node0);

        // Print the value of the starting node of the cycle.
        if (result != null) {
            System.out.println("Starting node of the cycle: " + result.value);
        } else {
            System.out.println("There is no cycle in the linked list.");
        }

    }
}
