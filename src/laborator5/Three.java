package laborator5;

public class Three {
    static int t(int n) {
        if (n != 0)
            return (n % 2) * n + t(n - 1);

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(t(12));
    }
}
