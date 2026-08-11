package Arrays;

import java.util.Arrays;

public class displayarray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};


        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
