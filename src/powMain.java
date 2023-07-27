public class powMain {
    public static void main(String[] args) {

        powSolution solution = new powSolution();

        // 2 to the power 3 = 2 * 2 * 2
        double x = 2.0;
        int n = 3;
        double output = solution.myPow(x,n);
        System.out.println(output);
    }
}
