package Algorithm.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4,7,6};
        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int idx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[idx] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
