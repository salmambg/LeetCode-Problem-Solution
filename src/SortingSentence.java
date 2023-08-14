public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] arr = s.split(" ");
        // Create an array to hold the sorted words.
        String[] sorted = new String[arr.length];
        for (String str : arr) {
            int len = str.length(); // "is2": len is 3 (length of the word).
            // Extract the last character of the word, which is a digit
            int index = str.charAt(len - 1) - '0';//   "is2", then str.charAt(len - 1) extracts the character '2', and subtracting '0' from it converts it to the integer value 2.
            // This integer value is then used as an index to place the word "is2" in the sorted array at index 2 - 1, which is index 1.
            // This conversion is based on the ASCII values of characters.
            sorted[index - 1] = str.substring(0, len - 1); //str is "is2":len will be 3 (since the word has three characters: 'i', 's', '2').
            //str.substring(0, len - 1) will extract the substring from index 0 to 1, which means it will extract the characters 'i' and 's'.
            // If index is 2 (because the last digit is '2'), then sorted[index - 1] refers to sorted[1].
            //Therefore, the extracted substring "is" will be assigned to sorted[1], which means that "is" will be placed in the sorted array at index 1.
        }
        System.out.println(String.join(" ",sorted)); //The first argument " " is the delimiter that will be inserted between each element when they are joined together.
    }
}
