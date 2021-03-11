package laborator2;
import java.util.Scanner;
import java.util.ArrayList;

public class AvgNumbers {
    public double calculate() {
        int sum = 0;
        int n;
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Input number: ");
            n = read.nextInt();

            if (n != 0) arr.add(n);
        } while (n != 0);

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

       return (double) sum / arr.size();
    }
}

//javac -d ./Packages ./Sources/avgNumbers.java
//java -classpath ./Packages ./Progs/Four.java