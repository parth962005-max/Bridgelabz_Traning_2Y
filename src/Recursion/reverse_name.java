package Recursion;

public class reverse_name {
    public static void print(String name, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(name.charAt(index));
        print(name, index - 1);
    }

    public static void main(String[] args) {
        String name = "Parth";
        print(name, name.length() - 1);
    }
}
