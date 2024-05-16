package Sort;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {4,1,2,3,5};
        quickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end){

        if(start>= end) return;

        int pivot = start;
        int low = start + 1;
        int high = end;

        while(low<=high){
            while(low<=end && arr[low] <= arr[pivot]) low++;
            while(high>start && arr[high] >= arr[pivot]) high--;

            if(low>high){
                swap(arr,high,pivot);
            }else {
                swap(arr,low,high);
            }
        }
        quickSort(arr,start,high-1);
        quickSort(arr,high+1,end);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
