public class TriangleSum {
    public static void main(String[] args) {
        int[][] triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int rows = triangle.length;
        int[] dp = new int[rows+1];
        for (int i = rows-1; i >= 0; i--) {
            for (int j = 0; j <= i ; j++) {
                dp[j] = Math.min(dp[j],dp[j+1]) + triangle[i][j];

            }
        }
        System.out.println(dp[0]);
    }
}
