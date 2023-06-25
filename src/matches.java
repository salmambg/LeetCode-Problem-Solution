public class matches {
    public static void main(String[] args) {
        int n = 7 ;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 ) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
