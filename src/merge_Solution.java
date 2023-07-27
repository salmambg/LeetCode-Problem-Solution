public class merge_Solution {
    public Node mergedTwoLists(Node list1, Node list2) {
        Node head = new Node();
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.value > list2.value) {
            head = list2;
            list2= list2.next;
        }else {
            head = list1;
            list1 = list1.next;
        }
        head.next = mergedTwoLists(list1,list2);
        return head;

    }
}
