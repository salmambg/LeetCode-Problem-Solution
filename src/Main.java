import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String name = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        Map<Character, Character> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i); // c=t, h
            if (c == ' ') continue;
            if (!map.containsKey(c)) {
                map.put(c, (char) ('a' + j++)); // t = a, b
            }
        }
        StringBuilder str=new StringBuilder();
        for (int i=0;i<message.length();i++) {
            char c=message.charAt(i);
            if (c==' '){
                str.append(' ');
                continue;
            }
            str.append(map.get(c));
        }
        System.out.println(str.toString());
    }
}