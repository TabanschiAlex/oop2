package laborator5;

class Unu {
    int a = 1;

    void afis() {
        System.out.println(a);
    }
}

class Doi extends Unu {
    int a = 2;

    void afis() {
        System.out.println(a);
    }
}

public class Eight {
    public static void main(String[] args) {
        int n = 3;
        Unu x;

        if (n == 1) {
            x = new Unu();
        } else {
            x = new Doi();
        }

        x.afis();
        System.out.println(x.a);
    }
}
