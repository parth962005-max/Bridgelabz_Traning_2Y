package methods;
import java.util.Scanner;
public class calculator {
    public static void main() {
        System.out.println("Enter an operator");
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            char op = sc.next().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }else{
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                }
                System.out.println("Answer is " +ans);
            }else {
                System.out.println("Invalid operator");
            }

        }
    }
}
