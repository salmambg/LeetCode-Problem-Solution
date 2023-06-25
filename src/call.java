public class call {
    public static void main(String[] args) {
        int num = 14;
        int  n = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            }else {
                num = num-1;
            }
            n++;
        }
        System.out.println(n);

    }
}
