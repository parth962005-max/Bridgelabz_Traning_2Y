package methods;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void rd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        for (int j : arr) {
            if (j != -1) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rd(arr);
    }
}
