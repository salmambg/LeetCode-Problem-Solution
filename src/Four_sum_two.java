import java.util.HashMap;
import java.util.Map;

public class Four_sum_two {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {-2,-1};
        int [] nums3 = {-1,2};
        int [] nums4 = {0,2};
        int result = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for (int n1: nums1) {
            for (int n2 : nums2) {
                map.put(n1+n2, map.getOrDefault(n1+n2, 0)+1);
                //Iterated over nums1 and nums2, pairSums = {1 + (-2), 1 + (-1), 2 + (-2), 2 + (-1)}
                //= {-1, 0, 0, 1}
                //now the map contains = {-1 : 1, 0 : 2, 1 : 1}
            }
        }
        //Iterated over nums3 and nums4, pairSums = {-1 + 0, -1 + 2, 2 + 0, 2 + 2}
        //= {-1, 1, 2, 4}
        //Negate this to be able to find -(c + d)// for example if the sum of n3 ans n4 is 1 so we have to find -1 in the map to get a sum of 0
        // that's why we use the minus sign before the sum of n3 and n4
        //= {1, -1, -2, -4}
        //check in the  the hashMap map = {-1 : 1, 0 : 2, 1 : 1} for each item in {1, -1, -2, -4}
        // then we count the frequency of each item and if there is not then we will return 0
        for (int n3 : nums3) {
            for (int n4 : nums4) {
               result += map.getOrDefault(-(n3+n4),0);
               //result = 0
                //result+= map.get(1)  ⇒ fourSumCount = 0 + 1 = 1
                //result += map.get(-1) ⇒ fourSumCount = 1 + 1 = 2
                //result += map.get(-2) ⇒ fourSumCount = 2 + 0 = 2
                //result += map.get(-4) ⇒ fourSumCount = 2 + 0 = 2
                //Number of tuples = 2 [Ans]
            }
        }
        System.out.println(result);
    }
}
