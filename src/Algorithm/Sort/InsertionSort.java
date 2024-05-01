package Algorithm.Sort;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {6,4,3,7,1,9,8};

        for(int i = 1; i < arr.length; i++){
            int j;
            int tmp = arr[i];
            for(j = i; j > 0 && arr[j-1] > tmp; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
