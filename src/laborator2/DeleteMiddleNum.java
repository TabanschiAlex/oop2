package laborator2;
import java.util.Scanner;

public class DeleteMiddleNum {
    Scanner in = new Scanner(System.in);

    public int deleteMiddleNum() {
        int n = in.nextInt();
        if (!(n >= 10000 && n < 100000)) {
            System.out.println("Conditions do not satisfy");
            System.exit(1);
        }

        return ((n / 1000) * 100) + n % 100;
    }

    public int deleteMiddleNumToString() {
        int n = in.nextInt();
        int pos;
        String stringNum = Integer.toString(n);

        if (stringNum.length() % 2 == 1) {
            pos = stringNum.length() / 2;
        } else {
            pos = (stringNum.length() / 2) - 1;
        }

        return Integer.parseInt(stringNum.substring(0, pos) + stringNum.substring(pos + 1));
    }
}