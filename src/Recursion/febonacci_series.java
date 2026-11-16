package Recursion;

public class febonacci_series {
    public static int feb(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return feb(n - 1) + feb(n - 2);
    }

    public static void main(String[] args) {
        int n = 15;
        printFeb(0, n);
    }

    static void printFeb(int i, int n) {
        if (i == n) {
            return;
        }

        System.out.print(feb(i) + " ");
        printFeb(i + 1, n);
    }
}
