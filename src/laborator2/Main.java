package laborator2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String option = "";
        Scanner read = new Scanner(System.in);

        MinValue min = new MinValue();
        Subunit sub = new Subunit();
        CirculateNum rotate = new CirculateNum();
        DeleteMiddleNum middle = new DeleteMiddleNum();
        AvgNumbers avg = new AvgNumbers();

        do {
            System.out.print("Select option (avg, delete, min, rotate, subunitly): ");
            option = read.next();
            switch (option) {
                case "avg" -> System.out.println("Average number: " + avg.calculate());
                case "delete" -> System.out.println("After delete middle number: " + middle.deleteMiddleNum());
                case "min" -> System.out.println("Minimal value is: " + min.getMinValue());
                case "rotate" -> rotate.circulate();
                case "subunitly" -> sub.show();
            }
        } while (option.equals("exit"));

    }
}
