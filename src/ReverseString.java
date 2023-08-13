import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char [] s = { 'h','e','l','l','o'};
        for(int i=0, j = s.length - 1; i< s.length/2; i++, j--){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }

        System.out.println(Arrays.toString(s));
    }
}
