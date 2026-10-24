package Recursion;

public class palindrome {
    public static boolean palindrome(String name, int start, int end) {
        if(start>=end){
            return true;
        }
        if(name.charAt(start)!=name.charAt(end)){
            return false;
        }
        return palindrome(name,start+1,end-1);
    }

    public static void main() {
        String name = "madam";
        System.out.println(palindrome(name, 0, name.length() - 1));
    }
}
