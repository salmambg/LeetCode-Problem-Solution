public class majorElement {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        int majority = nums[0];
        int votes = 1 ;
        for (int  i = 1; i < nums.length; i ++ ) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority== nums[i]) {
                votes++;

            }else {
                votes--;
            }
        }
        System.out.println(majority);
    }
}
// here we suppose that nums[o] has one vote at first. so we conduct the loop from nums[1]
// so it will first check the votes is equal to 0 or not if its  0 it will increase 1 and update the majority element
// if not it will check that the majority element is equal to nums[i] or not if its it will increase the vote
// if not it will decrease the votes.
// like now we have at first nums[0] which is 3 with one vote.
// so the loop starts nums[1] which is 2 and enter the conditions.
// as the vote= 1 now it will skip first if condition bcz votes!= 0
// it will enter else if condition it is also not true bac majority is 3 which is nums[0] and the current num is 2
// so it will implement the else condition and votes will decrease to 0;
// then the loop is for  nums[2] which is 3 so it will conduct the first if condition as votes ==0 from the prevous step
// so majority will update to nums[2] which is 3 with vote 1 bcz votes++;
// loop is finished and it will return the majority which is 3

