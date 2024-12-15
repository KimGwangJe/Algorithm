package Sort;

public class SelectSort {
    static int[] arr = new int[]{42,32,24,60,15};

    public static void main(String[] args){
        for(int i = 0; i < arr.length - 1; i++){
            int temp = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[temp] > arr[j]){
                    temp = j;
                }
            }
            swap(i, temp);
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
