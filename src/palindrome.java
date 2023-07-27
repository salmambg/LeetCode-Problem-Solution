public class palindrome {
    public static void main(String[] args) {
        String s = "aacecaaa";
        StringBuilder sb = new StringBuilder(s);
        String newString= String.valueOf(sb.reverse());

       String subString = "";
        for (int  i = 0; i < s.length();i++) {
            subString = newString.substring(i);
            if (s.startsWith(subString)) {
                newString = newString.substring(0,i);
                break;
            }
        }
        System.out.println(newString);
        System.out.println(newString+s);
    }
}
