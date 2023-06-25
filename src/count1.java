public class count1 {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int count = 0;
        while (num != 0) {
            int r = num % 10;
            if (temp % r == 0) {
                count++;
            }
            num =num/10;
        }
        System.out.println(num);
        System.out.println(count);
    }
}
