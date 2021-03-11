package laborator2;

import java.util.ArrayList;
import java.util.Scanner;

public class MinValue {
    public double getMinValue() {
        double value = 1000;
        double n;
        ArrayList<Double> arr = new ArrayList<>();
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Input number: ");
            n = read.nextDouble();

            if (n != 0) arr.add(n);
        } while (n != 0);

        for (Double aDouble : arr) {
            if (aDouble < value) {
                value = aDouble;
            }
        }

        return value;
    }
}


