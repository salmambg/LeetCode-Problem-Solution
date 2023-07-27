public class SubarraysofArray {
    public static void main(String[] args) {
        int [] [] groups = {{1,-1,-1},{3,-2,0}};
        int [] num = {1,-1,0,1,-1,-1,3,-2,0};

        int row = 0;
        for (int i = 0; i <num.length; i++) {
            int col =0;
            int j = i;
            while (col<groups[row].length && j < num.length && num[j]== groups[row][col]) {
                col++;
                j++;
            }
            if (groups[row].length == col) {
                row++;
                i = j-1;
            }
            if (row == groups.length) {
                System.out.println(true);
            }
        }
        System.out.println("Result: " + (row == groups.length));

    }
}
