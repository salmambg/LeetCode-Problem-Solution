public class unique {
    public static void main(String[] args) {
        String s = "leetcode";
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c-'a'] +=1;
        }
        for (int i = 0; i <s.length(); i++) {
            if (count[s.charAt(i)-'a']==1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);


    }
}
