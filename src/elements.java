import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class elements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1 );
            }else {
                map.put(nums[i],1 );
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum+= entry.getKey();
            }
        }
        System.out.println(sum);
    }
}
