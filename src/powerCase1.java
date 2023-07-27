public class powerCase1 {
    public static void main(String[] args) {
        int n = 1;
        if (n <= 0) {
            System.out.println(false);
        }
        if ((n&(n-1)) == 0) { //the zero can be represented by two bit representations (10000 and 00000)
            //16 & 15 = 10000 & 01111 = 00000.
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
