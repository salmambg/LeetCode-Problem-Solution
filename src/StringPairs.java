import java.util.HashSet;

public class StringPairs {
    public static void main(String[] args) {
        String [] words = {"cd","ac","dc","ca","zz"};
        int ans = 0;
        HashSet< String > used = new HashSet<>();
        HashSet< String > all = new HashSet<>();
        for (String word : words) {
            all.add(word);
        }
        for (String word : words) {
            if(used.contains(word)) {
            continue;
            }
            String rev = new StringBuilder(word).reverse().toString();
            if (all.contains(rev) && !used.contains(rev) && !rev.equals(word)) { // here we use !rev.equals(word) because we don't want to count the same thing like zz after reversing it will again zz
                //so it should not be same
                ans++;
                used.add(rev);
                used.add(word);
            }
        }
        System.out.println(ans);

    }
}
