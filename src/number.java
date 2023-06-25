import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class number {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        List<Integer> list = new ArrayList<>(set1);
        list.removeAll(set2);

        List<Integer> list2 = new ArrayList<>(set2);
        list2.removeAll(set1);


        List<List<Integer>> result = new ArrayList<>();
        result.add(list);
        result.add(list2);

        System.out.println(result);


    }
}
