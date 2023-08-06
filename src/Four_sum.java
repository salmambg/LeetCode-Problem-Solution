import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_sum {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int [] nums= {1,0,-1,0,-2,2};
        int n = nums.length;
        int target = 0;
        if (nums == null && n < 4) {
            System.out.println(result);
        }
        Arrays.sort(nums);
        for (int i = 0; i < n-3; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                for (int j = i+1; j < n-2; j++) {
                    if (j == 0 || nums[j] != nums[j-1]) {
                        int left = j+1, right = n-1;
                        while (left < right) {
                            int sum = nums[i] + nums[j] + nums [left] + nums[right];
                            if (sum == target) {
                              result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                              left++;
                              right --;
                              while (left < right && nums[left] == nums[left-1]) {
                                  left++;
                              }
                                while (left < right && nums[right] == nums[right+1]) {
                                    right--;
                                }

                            } else if (sum < target) {
                                left++;
                            }else {
                                right --;
                            }
                        }
                    }
            }


           }
        }
        System.out.println(result);
    }
}
