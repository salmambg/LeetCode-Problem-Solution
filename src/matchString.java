public class matchString {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        String[] arr = sentence.split(" ");

        for (int  i = 0; i < arr.length; i++ ) {
            if (arr[i].indexOf(searchWord) == 0) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}
