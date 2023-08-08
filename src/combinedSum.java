import java.util.ArrayList;
import java.util.List;

public class combinedSum {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int [] candidates = {2,3,6,7};
        int target = 7;
        backTrack(candidates, target, 0, new ArrayList(), res);
        System.out.println(res);
    }
    private  static void backTrack(int[] cand, int target, int start, List<Integer>list,List<List<Integer>>result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <cand.length; i++) {
            list.add(cand[i]);
            backTrack(cand,  target-cand[i], i, list,result);
            list.remove(list.size()-1);
        }

    }
}
