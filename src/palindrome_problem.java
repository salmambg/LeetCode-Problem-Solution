public class palindrome_problem {
    public static void main(String[] args) {
            Node head = new Node (1);
            head.next = new Node (2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(1);

            Pali_solution solution = new Pali_solution();

            boolean result = solution.isPalindrome(head);
            System.out.println(true);

    }
}
