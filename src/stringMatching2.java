public class stringMatching2 {
    public static void main(String[] args) {
        String a = "a";
        String b = "aa";

        StringBuilder sb = new StringBuilder(a);
        int count = 1;
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (sb.toString().contains(b)) {
            System.out.println(count);
        } else {
            sb.append(a);
            count++;
            if (sb.toString().contains(b)) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}
