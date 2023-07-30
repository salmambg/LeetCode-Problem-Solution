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
        if (n >= 0) {
            return power(x,n);
        }else {
            return (1/power(x,n*-1));
        }
    }

}
// initial call is power(2.0, 10).
//(10 % 2 == 0), it makes a recursive call with n / 2 = 5: ans = power(2.0, 5).
//(2% 2 ==0)since n is even (2 % 2 == 0), it makes yet another recursive call with n / 2 = 1: ans = power(2.0, 1).
//Now, n is 1, and the base case is reached. The recursive calls start returning:
//power(2.0, 1) returns 2.0 (base case for n = 1).
//power(2.0, 2) returns 2.0 * 2.0 = 4.0.
//power(2.0, 5) returns 4.0 * 4.0 * 2.0 = 32.0.
//power(2.0, 10) returns 32.0 * 32.0 = 1024.0.

