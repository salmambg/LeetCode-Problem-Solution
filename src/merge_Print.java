public class merge_Print {
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        merge_Solution solution = new merge_Solution(); //create an instance of the merge_Solution class

        //call the mergeTwoLists method and store the result
        Node result = solution.mergedTwoLists(list1, list2);

        System.out.println("Merged List : ");

        Node current = result;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
