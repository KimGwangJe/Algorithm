package Sort;

public class SelectSort {
    static int[] arr = new int[]{42,32,24,60,15};

    public static void main(String[] args){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            swap(min, arr[i]);
        }
    }

    public static void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
