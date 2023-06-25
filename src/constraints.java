import java.util.HashSet;
import java.util.Set;

public class constraints {
    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        int count = 0;

        Set<Character> set= new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }
        int check = 0;
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (set.contains(ch)) {
                    check = 1;
                }else {
                    check = 0;
                    break;
                }
            }
            if (check == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
