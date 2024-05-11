package Sort;

public class SelectSort {
    static int[] arr = new int[]{42,32,24,60,15};
    static int idx = 0;

    public static void main(String[] args){
        for(int i = 0; i < arr.length - 1; i++){
            int max = arr[i];
            for(int j = i; j < arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    idx = j;
                }
            }
            swap(i,idx);
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
