package Recursion;

public class power {

    public static int fact(int n, int p) {
        if (p == 0) {
            return 1;
        }

        return n * fact(n, p - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(10, 3));
    }
}

