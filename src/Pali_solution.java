public class Pali_solution {
    public boolean isPalindrome(Node head) {
        Node temp = head;
        int num = 0;
        int rev = 0;
        int mul = 1;
        while (temp != null) {
            num = num * 10 + temp.value;
            rev = rev + temp.value *mul;
            mul  = mul * 10;
            temp = temp.next;
        }
        return num == rev;
    }
}
