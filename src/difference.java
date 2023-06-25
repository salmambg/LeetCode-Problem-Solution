public class difference {
    public static void main(String[] args) {
        int[] nums = new int[] {1,15,6,3};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }


        int sumofDigit = 0;
        for (int i = 0 ; i < nums.length; i++) {
            while (nums[i] > 0) {
                int rem = nums[i] % 10;
                sumofDigit = rem + sumofDigit;
                nums[i] = nums[i] / 10 ;
            }
        }
        System.out.println(sumofDigit);
        System.out.println(Math.abs(sum-sumofDigit));
    }
}
