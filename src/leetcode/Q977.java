package leetcode;

import java.util.Arrays;

public class Q977 {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int i = n - 1;

        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
            i--;
        }

        return result;
    }

    public static void main(String[] args) {

        Q977 obj = new Q977();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = obj.sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}