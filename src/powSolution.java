public class powSolution {
    public double power (double x , int n) { // x = 2, n = 9
        // 6

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        // recursion => 5! => 5 * 4 * 3 * 2 * 1

        if (n % 2 == 0) { // n = 9, n%2 = 1
            double ans = power(x,n/2); // n / 2 = 4
            return ans*ans;
        }else {
            double ans = power(x, n/2);
            return ans*ans*x;
        }
    }
    public double myPow (double x, int n) { // x = 2, n = 3
        if (n >= 0) { // eikhane asi
            return power(x,n);
        }else {
            return (1/power(x,n*-1));
        }
    }

}
// initial call is power(2.0, 10).
//(10 % 2 == 0), it makes a recursive call with n / 2 = 5: ans = power(2.0, 5).
//(2% 2 ==0)

