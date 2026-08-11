package Arrays;
public class Pairclass {
    static void main(){
     int arr[]  = {1,2,3,4,5,6,7,8,9};
     int target;
        System.out.println(pairclass(arr,9));
    }
    public static int pairclass (int [] arr, int target) {
        int doublecount = 0;
        for(int i=0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){

                if (arr[i]+arr[j]==target) {

                    doublecount++;
                }
            }
        }
        return doublecount;
    }
}
