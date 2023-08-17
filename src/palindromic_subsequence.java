public class palindromic_subsequence {
    public static void main(String[] args) {
        String s = "baab";
        if (isPalindrome(s)) {
            System.out.println(1);
        }else {
            System.out.println(2);
        }


    }
    public static boolean isPalindrome (String s) {
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
