public class multiple {
    public static void main(String[] args) {
//        int n = 13;
//        if(n % 2 == 0) {
//            System.out.println(n);
//        }else
//            System.out.println(n*2);

        int n1 = 234;
        int sum = 0;
        int pro = 1;

        while (n1 != 0) {
            int rem = n1 % 10;
            sum = sum + rem;

            n1 = n1 / 10;

            pro =pro * rem;
        }
        System.out.println(pro);
        System.out.println(pro-sum);
    }
}
