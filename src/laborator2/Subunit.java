package laborator2;

import java.util.Scanner;

public class Subunit {
    public void show() {
        Scanner read = new Scanner(System.in);
        System.out.print("Input array lenght: ");
        int arr[] = new int[read.nextInt()];
        int n = 0;
        int count = 0;

        do {
            System.out.print("Input number: ");
            n = read.nextInt();

            if (n != 0) arr[count++] = n;
        } while (count != arr.length);

        System.out.println("Subunit: " + arr[arr.length - 2] + "/" + arr[arr.length - 1]);
    }
}