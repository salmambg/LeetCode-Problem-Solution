public class FirstPalindrome {
    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                System.out.println(words[i]);
                break;
            }
        }
        System.out.println(" ");

    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
