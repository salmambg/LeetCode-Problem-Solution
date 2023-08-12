import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet2 {
    public static void main(String[] args) {
        int [] nums = {1,2,2};
        List<List<Integer>> output = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            System.out.println(output);
        }
        Arrays.sort(nums);
        List<Integer> subSet = new ArrayList<>();
        toFindAllSubsets(nums, output, subSet, 0);
        System.out.println(output);
    }
    private static void toFindAllSubsets(int [] nums, List<List<Integer>> output, List<Integer>subSet, int startIndex){
        output.add(new ArrayList<>(subSet));
        for (int i = startIndex; i <nums.length; i++) {
            if ( i != startIndex && nums[i] == nums[i-1]) {
                continue;
            }
            subSet.add(nums[i]);
            toFindAllSubsets(nums, output, subSet, i+1);
            subSet.remove(subSet.size()-1);
        }
    }

}
