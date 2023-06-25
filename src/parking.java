public class parking {
    int bigRemaining;
    int medRemaining;
    int smallRemaining;
    public  parking ( int big, int medium, int small) {
        bigRemaining = big;
        medRemaining = medium;
        smallRemaining =small;

        }
    public boolean addCar(int carType) {
        if (carType == 1 && bigRemaining > 0) {
            bigRemaining--;
            return true;
        } else if (carType == 2 && medRemaining > 0) {
            medRemaining--;
            return true;
        } else if (carType == 3 && smallRemaining > 0) {
            smallRemaining--;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        parking obj = new parking(1,1,0);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));

    }

}
