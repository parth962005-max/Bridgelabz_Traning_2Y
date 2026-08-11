import java.sql.SQLOutput;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user until user press x or X
        int ans = 0;
        while (true) {
            // Take the operator as an input.
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

