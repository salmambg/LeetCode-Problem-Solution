public class indexOccuring {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int count = 0;

        for (int i = 0; i < haystack.length()-needle.length() +1; i++) {
            //it will not go last index of haystack , so the neddle is length of 3 which is sad so in haystack if the third last will not match the first character it does not make any sense to go last two index
            // so as the length of haystackis 9 we have to check till 7. so upper condition is like that (9-3)+1=7
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i,needle.length()+i).equals(needle)) {
                    count++;
                    System.out.println(i);

                }
            }if (count==0) {
                System.out.println(-1);
            }
        }



    }
}
