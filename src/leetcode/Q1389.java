package leetcode;
import java.util.ArrayList;
public class Q1389 {
        public static int[] CreateTargetArray ( int nums[], int index[]){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i], nums[i]);
            }
            int[] target = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                target[i] = list.get(i);
            }
            return target;
        }
    }