import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_sum {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int [] nums= {0, 0, 0, 0};
        int n = nums.length;
        int target = 0;
        if (nums == null && n <4) {
            System.out.println(n);
            System.out.println(result);
        }
        Arrays.sort(nums);
        for (int i = 0; i < n-3; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                for (int j = i+1; j < n-2; j++) {
                    if (j > i+1 && nums[j] == nums[j-1]) {
                        continue;
                    }
                        int left = j+1, right = n-1;
                        while (left < right) {
                            long sum = (long) nums[i] + nums[j] + nums [left] + nums[right]; //the extreme values of the input array and the target,
                            // which can lead to integer overflow in the calculations
                            //The input array contains large integers, and when you add them up in the fourSum function,
                            // it may result in integer overflow.
                            //To fix this, you can change the sum variable's data type to long to handle the large numbers:
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
        System.out.println(result);
    }
}
