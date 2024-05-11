package Sort;

public class BubbleSort {
    static int[] arr = {5,2,3,4,1};
    public static void main(String[] args){
        for(int i = 0;i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(j,j+1);
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
