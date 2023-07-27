import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int number;
        number= input.nextInt();
        if (number <= 1) {
            System.out.println(number);
        }else {
            int a = 0, b = 1, c = a + b;
            for (int i = 1; i < number; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
        // initial two terms of fibonacci series are 0 and 1

    }
}
