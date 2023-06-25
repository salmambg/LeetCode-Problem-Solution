import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sort {
    public static void main(String[] args) {
        String [] names = {"Mary","John","Emma"};
        Integer [] heights = {180,165,170};

        String [] result = new String[names.length];
        Map<Integer, String> m =new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            m.put(heights[i],names[i]);
        }
        int index= 0;
        Arrays.sort(heights);
        for (int i = heights.length-1; i >= 0; i--) {
            result [index] = m.get(heights[i]);
            index++;
        }
        System.out.println(Arrays.toString(result));
    }
}
