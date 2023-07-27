public class powerCase2 extends powercase2_1{
    public static void main(String[] args) {
        int n = 27;
//        int  i =1;
//        while(i < n) {
//            i = i*3;
//        }
//        if (i == n) {
//        System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of three.");
        } else {
            System.out.println(n + " is not a power of three.");
        }

    }
}
//Recursion is a programming technique where a function solves a problem by calling itself.
// It breaks down a complex problem into smaller, similar sub problems and solves them until a base case is reached.
// The base case is a condition that indicates when the recursion should stop,
// and it typically represents the simplest form of the problem that can be solved directly.
