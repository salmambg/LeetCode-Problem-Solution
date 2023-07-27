public class BinaryLinkedListToDecimal {
    public int getDecimalValue (LinkedNode head) {
        int decimaValue = 0;
        while (head!= null) {
            decimaValue = decimaValue * 2 +head.val;
            head =head.next;
        }
        return decimaValue;
    }
}
