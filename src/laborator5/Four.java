package laborator5;

class a {
    int a = 1;

    int a() {
        int a = 2;
        return a;
    }
}

class Four extends a{
    public static void main(String[] args) {
        a a = new a();
        a x = new a();

        //c
        System.out.println(x.a());
    }
}
