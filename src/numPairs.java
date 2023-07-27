import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class numPairs {
    public static void main(String[] args) {
        int [] nums = {1,3,2,1,3,2,2};
        int [] cnt = new int[101];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0)+1);
//        }
//       int [] res = new int[2];
//        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            res[0] += entry.getValue()/2;
//            res[1] += entry.getValue()%2;
//        }
//        System.out.println(Arrays.toString(res));
        for (int num : nums) {
            cnt[num]++;
        }
        int pairs = 0, leftover = 0;
        for (int c : cnt) {
            pairs += c/2;
            leftover += c%2;
        }
        int [] res = {pairs, leftover};
        System.out.println(Arrays.toString(res));
    }
}
