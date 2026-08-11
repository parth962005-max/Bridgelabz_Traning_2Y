package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayList {
    public static void main() {
         ArrayList<Integer> list =new ArrayList<>();
         list.add(0,5);
        list.add(1,2);
        list.add(2,100);
        list.add(3,21);
        list.add(4,12);
        int []arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]= list.get(i);
    }
        System.out.println(Arrays.toString(arr));
        System.out.println("The given list is:-" +list);

    }
}
