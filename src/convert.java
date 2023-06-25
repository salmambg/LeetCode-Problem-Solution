import java.util.Arrays;

public class convert {
    public static void main(String[] args) {
        double Celsius = 36.50;
        double ans [] = new double[2];

        double Kelvin= Celsius + 273.15;
        double Farenheit =  Celsius * 1.80 + 32.00;

        ans [0] = Kelvin;
        ans [1] = Farenheit;

        System.out.println(Arrays.toString(ans));


    }
}
