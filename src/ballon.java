public class ballon {
    public static void main(String[] args) {
        String text = "nlaebolko";
        int [] count = new int[26];
        for (char c : text.toCharArray()) {
            count [c-'a'] ++; //output will be
//            count[0] = 1  // 'a'
//            count[1] = 1  // 'b'
//            count[2] = 0  // 'c'
//
//            count[11] = 2 // 'l'
//
//            count[13] = 1 // 'n'
//
//            count[14] = 2 // 'o'
//
//            count[25] = 0 // 'z'
        }
        int minInstances= Integer.MAX_VALUE;// in  int variables can store values from -2,147,483,648 to 2,147,483,647. Integer.MAX_VALUE is a constant that represents the latter value. So minInstances is initialized with 2,147,483,647.
        minInstances = Math.min(minInstances,count['b'-'a']); // min instance= 1 bcz it always compared with the minInstance which is int max value
        minInstances = Math.min(minInstances,count['a'-'a']);
        minInstances = Math.min(minInstances,count['l'-'a']/2);
        minInstances = Math.min(minInstances,count['o'-'a']/2);
        minInstances = Math.min(minInstances,count['n'-'a']);
        System.out.println(minInstances);

    }
}
