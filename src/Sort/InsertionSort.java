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
    }
}
