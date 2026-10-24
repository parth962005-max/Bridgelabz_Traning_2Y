package Recursion;

public class printreverse {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printNum(n-1);
    }
    public static void main() {
        int n = 10;
        printNum(n);
    }
}
