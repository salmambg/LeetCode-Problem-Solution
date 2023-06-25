import java.util.HashSet;
import java.util.Set;

public class unique_code {
    public static void main(String[] args) {
        String [] word = {"gin","zen","gig","msg"};
        Set< String  > set = new HashSet<>();
        String [] arr= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String w : word) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i<w.length(); i++) {
                sb.append(arr[w.charAt(i)- 'a']);
            }
            System.out.println(sb);
            set.add(sb.toString());
        }
        System.out.println(set);

    }
}
