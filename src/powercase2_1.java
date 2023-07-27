public class powercase2_1 {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            System.out.println("Base case: n == 1");
            return true;
        } else if (n == 0 || n % 3 != 0) {
            System.out.println("Base case: n == 0 or n is not divisible by 3");
            return false;
        } else {
            System.out.println("Recursive case: n = " + n);
            return isPowerOfThree(n / 3);
        }
    }
}
