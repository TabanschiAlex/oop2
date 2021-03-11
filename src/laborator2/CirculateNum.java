package laborator2;

import java.util.Scanner;
import java.sql.Array;
import java.util.Arrays;

public class CirculateNum {
    public void circulate() {
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

        int steps = arr.length - 1;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < steps; i++) {
            int temp = arr[0];

            for (int j = 0; j < arr.length - 1; j++)
                arr[j] = arr[j + 1];

            arr[arr.length - 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}