public class reverse_String_three {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String [] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            result.append(temp);
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
