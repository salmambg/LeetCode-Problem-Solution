public class chessBoard_Square {
    public static void main(String[] args) {
        String coordinates = "h3 "; // first one is charAt(0) and second one is charAt(1)
        boolean isBlack = isBlackSquare(coordinates);
        System.out.println(isBlack);

    }
    public static boolean isBlackSquare(String coordinates) {
        int num = (int) (coordinates.charAt(0)-'a' +1); // the (int) part is a type casting operation.
        // It is used to explicitly convert the result of the expression (coordinates.charAt(0) - 'a' + 1) into an integer data type
        int num1 =(int) (coordinates.charAt(1)-'1' +1);
        if ((num + num1) % 2 ==0) {
            return false;
        }
        return true;
    }
}
