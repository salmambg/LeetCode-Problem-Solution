import java.util.ArrayList;
import java.util.List;

public class stringMatch {
    public static void main(String[] args) {
        String [] words = {"mass","as","hero","superhero"};

        List<String> subString = new ArrayList<>();

        for (String word : words) {
            for (String subWords : words) {
                if (!word.equals(subWords) && subWords.contains(word)) {
                    subString.add(word);
                    break;
                }
            }
        }
        System.out.println(subString);
    }
}
