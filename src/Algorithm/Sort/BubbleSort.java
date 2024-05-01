package Algorithm.Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int t = 0;
        int[] arr = {6,4,3,1,7,8,9};
        for(int i = 0 ; i < arr.length - 1; i++){
            int change = 0;
            for(int j = 0; j < arr.length - i - 1; j++){
                t++;
                if(arr[j] > arr[j+1]){
                    change++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(change == 0) break;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(t);
    }
}
