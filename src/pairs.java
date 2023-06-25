import java.sql.Array;
import java.util.Arrays;

public class pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int pair = nums.length/2;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i+=2) {
            if (nums[i] == nums[i-1]) {
                count++;
            }
        }
        if (pair==count) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
