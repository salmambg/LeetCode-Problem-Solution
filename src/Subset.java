import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> output = new ArrayList<>();
        Helper(nums, output, 0,new ArrayList<Integer>());
        System.out.println(output);
    }
    public static void Helper(int [] nums, List<List<Integer>> output, int index,List<Integer> current) {
        output.add(new ArrayList<>(current)); // to pass an empty array
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            Helper(nums, output,i+1,current);
            current.remove(current.size()-1);
        }

    }
}
