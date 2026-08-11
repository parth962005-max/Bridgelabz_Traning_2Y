package methods;

import java.util.Scanner;

public class amstrong_numbers{
    public static int count(int a){
        int count =0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }
    public static boolean arm(int a){
        int x= a;
        double sum = 0;
        int d = count(a);
        while(a>0){
            int rem=a%10;
            sum=sum+Math.pow(rem,d);
            a=a/10;
        }
        return sum == x;

    }
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(arm(a));

    }

}

