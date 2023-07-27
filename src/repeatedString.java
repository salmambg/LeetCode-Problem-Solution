public class repeatedString {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        String s = word;

        int repeating = 0;


        while (sequence.contains(s)) {
            repeating++;
             s += word;
        }
        System.out.println(repeating);
    }
}
