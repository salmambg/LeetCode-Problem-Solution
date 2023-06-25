public class increaseDeccString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        int [] frequency = new int[26];
        int count = s.length();

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)-'a']++;
            // frequency[0 means a]=4
            // frequency[1 means b]=4
            // frequency[2 means c]=4
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int  i = 0; i < 25; i++) {
                if (frequency[i] > 0) {
                sb.append((char) ('a'+i));// we append this in sb as a character so when i = 0; 'a'+i=97 that means we append char a in the sb
                frequency[i]--;
                }
            }
            for (int  i = 25; i >= 0; i--) {
                if (frequency[i] > 0) {
                    sb.append((char) ('a'+i));
                    frequency[i]--;
                }
            }// after the first loop it will be abccba that means the length is 6 so its still true because in while loop it is now 6<12 so it will again start
        }    // after 2nd loop ahen it will finish 11 th iteartion its is still true that 11<12 then it will conduct 12th iteration and it will 12<12 then it exit the loop
        System.out.println(sb.toString());
    }
}
