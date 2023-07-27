import java.util.LinkedList;

public class binaryLinkedlist {
    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(1);
        head.next = new LinkedNode(0);
        head.next.next = new LinkedNode(1);

        BinaryLinkedListToDecimal converter = new BinaryLinkedListToDecimal();
        int decimalValue = converter.getDecimalValue(head);

        System.out.println(decimalValue);


    }
}
