public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while ( k != 0 ) {
            sb.append(arr[index] + " "); //
            index++;
            k--; //[Hello how are you ]
        }
        System.out.println(sb.toString().trim()); // trim is used to remove the whitespace after then you

    }
}
