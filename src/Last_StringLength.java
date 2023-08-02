public class Last_StringLength {
    public static void main(String[] args) {
        String s = "Hello World";
        int n = s.length(), result = 0;
        while(n > 0) {
            if(s.charAt(--n) != ' '){
                result ++;
            } else if ((result > 0)) {
                break;
            }
        }
        System.out.println(result);
    }
}
