package Sort;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {3,1,4,3,2};
        int[] sum = new int[arr.length];
        int result = 0;
        for(int i = 1; i <arr.length; i++){
            int min = arr[i];
            int idx = i; // 들어갈 인덱스
            for(int j = i-1; j >= 0; j--){
                if(arr[i] > arr[j]){
                    idx = j + 1;
                    break;
                }
                if(j == 0){
                    idx = 0;
                }
            }
            for(int k = i; k > idx ; k--){
                arr[k] = arr[k-1];
            }
            arr[idx] = min;
        }
        for(int a : arr){
            System.out.println(a);
        }
        sum[0] = arr[0];
        result += sum[0];
        for(int i = 1; i < arr.length; i++){
            sum[i] = sum[i-1] + arr[i];
            result += sum[i];
        }
        System.out.println(result);
        insert();
    }

    public static void insert(){
        int[] arr = {3,1,4,3,2};
        int[] sum = new int[arr.length];

        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            for(int k = minIndex; k > i; k--){
                arr[k] = arr[k-1];
            }
            arr[i] = min;
        }
        for(int i: arr){
            System.out.println(i);
        }
        sum[0] = arr[0];
        int result = sum[0];
        for(int i = 1; i < arr.length; i++){
            sum[i] = sum[i-1] + arr[i];
            result+=sum[i];
        }
        System.out.println(result);
    }
}
