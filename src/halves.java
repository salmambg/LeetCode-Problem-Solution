public class halves {
    public static void main(String[] args) {
        String s = "book";
        String vowels = "aeiouAEIOU";

        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());

        int a = 0, b = 0;
        for (int i = 0; i <s1.length();i++){
            if (vowels.indexOf(s1.charAt(i))>=0) {
                a++;
            }if (vowels.indexOf(s2.charAt(i))>=0) {
                b++;
            }
        }
        System.out.println(a==b);


    }

}
