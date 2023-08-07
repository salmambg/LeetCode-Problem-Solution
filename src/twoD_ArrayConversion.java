import java.util.ArrayList;
import java.util.List;

public class twoD_ArrayConversion {
    public static void main(String[] args) {
        List<List<Integer>> rows = new ArrayList<>();
        int [] nums = {1,3,4,1,2,3,1};
        int[] freq = new int[201];
        int maxFreq = 0;
        //Calculate the frequency and maximum frequency
        for (int val: nums) {
            freq[val]++; //freq = [0, 3, 1, 2, 1, 0, ..., 0]
            maxFreq = Math.max(maxFreq,freq[val]); //freq[val] is greater than maxFreq, then Math.max() returns freq[val] and maxFreq is updated with this value
        }
        //
        for (int i = 0; i < maxFreq; i++) { //ans list has enough sublists to accommodate elements with varying frequencies.
            rows.add(new ArrayList<>());
        }
        for (int i = 0; i < 201;i++) {
            if (freq[i] == 0){
                continue;
            }
            int j = 0;
            for (int k = 0; k <freq[i]; k++) { //The inner for loop from 0 to 2 iterates three times, because freq[1] is equal to 3. For each iteration, it does two things:
                //It adds the number 1 to the list at index j in the ans list. This is done by calling ans.get(j).add(i), which means get the list at index j and add the number i to it. For example, when j is 0, this means get the first list and add 1 to it.
                // When j is 1, this means get the second list and add 1 to it. And so on.
                //It increments j by 1, which means move to the next row in the ans list. For example, when j is 0,
                // this means move to the first row. When j is 1, this means move to the second row. And so on
                //After the inner for loop finishes, we have added three copies of 1 to consecutive rows in the ans list. The ans list becomes [[1],[1],[1]].
                // Similarly, when i = 2, we find that freq[2] = 1. This means that there is one 2 in the input array.
                // We add one copy of 2 to ans[0]: ans[0].add(2). Now ans becomes [[1,2],[1],[1]].
                // When i = 3, we find that freq[3] = 2. This means that there are two 3s in the input array. We add two copies of 3 to consecutive rows in ans: ans[0].add(3) and ans[1].add(3).
                // Now ans becomes [[1,2,3],[1,3],[1]].
                //. Finally, when i = 4, we find that freq[4] = 1. This means that there is one 4 in the input array. We add one copy of 4 to ans[0]: ans[0].add(4). Now ans becomes [[1,2,3,4],[1,3],[1]].
                // The final output is [[1,2,3,4],[1,3],[1]], which is a matrix with three rows and four columns.
                rows.get(j++).add(i);
            }
        }
        System.out.println(rows);

    }
}
//Step 2
// input nums = [1, 3, 4, 1, 2, 3, 1] and the resulting maxFreq = 3.

//The loop runs from i = 0 to i < maxFreq, which means it will execute three times since maxFreq is 3.

//Iteration 1: i = 0
//It adds an empty sublist to ans. After this iteration, ans will look like this:

//ans = [[]]


//Iteration 2: i = 1
//It adds another empty sublist to ans. After this iteration, ans will look like this:

//ans = [[], []]
//Iteration 3: i = 2
//It adds one more empty sublist to ans. After this iteration, ans will look like this:
//ans = [[], [], []]