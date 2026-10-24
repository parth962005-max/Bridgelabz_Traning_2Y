
package Recursion;

public class natural_sum {

    public static void printSum(int n, int i, int sum) {
        if (n == i) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSum(n, i + 1, sum);
    }

    public static void main(String[] args) {
        printSum(5, 1, 0);
    }
}
