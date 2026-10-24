package Recursion;

public class printnum {
    public static void printInc(int n) {
        if (n == 20) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printInc(n +2);
    }

    public static void main(String args[]) {

        printInc(10);
    }
}