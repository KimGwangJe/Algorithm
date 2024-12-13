package Sort;

public class InsertionSort {
    public static int[] arr = {3,1,4,3,2};
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        for(i = 1; i < arr.length; i++){
            int target = arr[i];
            for(j = i - 1; j >= 0; j--){
                if(arr[j]>target){
                    arr[j+1] = arr[j];
                } else{
                    break;
                }
            }
            arr[j+1] = target;
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
