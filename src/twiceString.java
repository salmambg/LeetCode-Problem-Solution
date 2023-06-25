public class twiceString {
    public static void main(String[] args) {
        String s = "abccbaacz";
        int [] arr = new int[26];

        for (char c : s.toCharArray()) {
            arr [c-'a']++;
            //    arr[0] = 3  // 'a'
            //    arr[1] = 2  // 'b'
            //    arr[2] = 3  // 'c'
            //................
            //    arr[25] =1 // 'z'
            if (arr [c-'a'] == 2) { // it will work like that whenever the first char have appear twice it will exit  the loop and return it
                System.out.println(c);
                break;
            }
        }

    }
}
// in this case when the loop starts arr[a-'a] means arr[0]=1 next  it will check the if condition and not match goes next loop
// arr[b-a] means arr[1]= 1 check if condition not match goes to next loop
// arr[c-a] means arr[2]= 1 check if condition not match goes to next loop
// arr[c-a] means arr[2]= 2 check if condition it  matched and it will return the character that it appeared first and will break and exit the lopp