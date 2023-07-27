import java.util.LinkedList;

public class circle {
    public static void main(String[] args) {
        int n = 5;
        int k =2;
        LinkedList<Integer> participants = new LinkedList<>();
        for (int  i = 1; i <= n; i++) {
            participants.add(i);
        }
        int lastKilled = 0;
        for (int i = 0; i < n; i++) {
            for (int  j = 0; j < k-1; j++) {
                participants.add(participants.poll());
            }
            lastKilled = participants.poll();
        }
        System.out.println(lastKilled);
    }
}
//The initial participants list is [1, 2, 3, 4, 5]. The lastKilled is 0.
//In the first step, i = 0. The inner loop runs from 0 to k-1 (1). In each iteration, it does the following:
//When j = 0, it removes the first element of the list (which is 1) using poll and adds it to the end using add. The list becomes [2, 3, 4, 5, 1].
//When j = 1, it stops because j < k-1 (or j < 1) is false. The inner loop ends.
//After the inner loop ends, it removes the first element of the list (which is 2) using poll and assigns it to lastKilled. The list becomes [3, 4, 5, 1]. The lastKilled is 2.
//In the second step, i = 1. The inner loop runs from 0 to k-1 (1). In each iteration, it does the following:
//When j = 0, it removes the first element of the list (which is 3) using poll and adds it to the end using add. The list becomes [4, 5, 1, 3].
//When j = 1, it stops because j < k-1 (or j < 1) is false. The inner loop ends.
