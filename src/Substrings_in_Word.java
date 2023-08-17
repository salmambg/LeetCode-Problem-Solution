public class Substrings_in_Word {
    public static void main(String[] args) {
        String [] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int count = 0;
        for (String p : patterns) {
            if (word.contains(p)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
