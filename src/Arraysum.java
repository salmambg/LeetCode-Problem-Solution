import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraysum {
    public static void main(String[] args) {
        // create a list to not put any duplicate
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        //-4,-1,-1,0,1,2;
        int n = nums.length;
        if(n < 3) {
            System.out.println(result);
        }
        for (int i = 0; i < n-2; i++) {//n-2 because when index 5 there are two elements left to form triplet;
            if (i == 0 || nums[i] != nums[i-1]) { // i==0 hole i-1 will be negative;
                int j = i+1, k = n-1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                        while (j < k && nums[j] == nums[j + 1]) {//  This loop runs as long as j is less than k (to prevent index out of bounds)
                            // here we make left bound and right bound  and check is there any duplicate
                            j++;
                        }
                        while (j < k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++;k--;

                    } else if (sum > 0) {
                        k--;
                        
                    }else {
                        j++;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
