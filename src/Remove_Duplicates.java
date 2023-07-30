public class Remove_Duplicates {
    public Node deleteDuplicates (Node head) {
        Node temp = head;
        if (head == null) {
            return head;
        }
        while (temp.next != null) { // This condition ensures that we continue looping as long as the current node temp
            // and its next node temp.next both exist
            // temp.next is null, it means we have reached the end of the linked list,
            // and there are no more nodes to check for duplicates.
            if (temp.value != temp.next.value) {
                temp = temp.next;
            }else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);

       Remove_Duplicates solution = new Remove_Duplicates();
       Node delete = solution.deleteDuplicates(head);
       Node current = delete;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");


    }
}

