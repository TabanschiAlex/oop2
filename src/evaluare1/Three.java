package evaluare1;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int a, b;
        Scanner read = new Scanner(System.in);

        a = read.nextInt();
        b = read.nextInt();

        System.out.println(calculate(a) == calculate(b));
    }

    public static int calculate(int number) {
        if (number == 0) return 0;
        return (number % 10) + calculate(number / 10);
    }
}
