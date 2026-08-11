package methods;
import java.util.Scanner;
public class sumofnatural {
   public static void main(String[] args) {
       System.out.println("Enter number");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = n*(n+1)/2;
       System.out.println("Sum of entered natural number is :" +sum);
    }
}
