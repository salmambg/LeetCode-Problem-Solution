import java.util.HashSet;
import java.util.Set;

public class arithmatic {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        Set<Integer> set= new HashSet<>();
        int ans=0;
        for (int i=0;i<nums.length;i++) {
            if (set.contains(nums[i]-diff)&& set.contains(nums[i]-2 * diff)) {
                ans++;
            }
            set.add(nums[i]);
        }
        System.out.println(ans);

    }
}
