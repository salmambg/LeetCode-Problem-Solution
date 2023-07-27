public class goal {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        if (s.length() == goal.length() && (s+s).contains(goal)) {
            System.out.println(true);
        }

    }
}
