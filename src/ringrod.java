import java.util.HashSet;
import java.util.Set;

public class ringrod {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        int count=0;
        Set<Integer> red = new HashSet<>();
        Set<Integer> green = new HashSet<>();
        Set<Integer> blue = new HashSet<>();
        for (int i = 0;i < rings.length(); i++) {
            if ( rings.charAt(i) == 'R') {
                red.add(rings.charAt(i+1) - '0');
            }
            if( rings.charAt(i) == 'G') {
                green.add( rings.charAt(i+1) - '0');
            }
            if ( rings.charAt(i) == 'B') {
                blue.add( rings.charAt(i + 1) - '0');
            }
        }
        for (int i = 0; i<=9; i++) {
            if (red.contains(i) && green.contains(i) && blue.contains(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
