package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {4,1,2,3,5};
        Arrays.sort(arr);
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

            // low가 더 크면 더이상 바꿀게 없기 때문에 pivot을 이동시킴
            if(low>high){
                swap(arr,high,pivot);
            }else {
                // 큰거 작은거 교체
                swap(arr,low,high);
            }
        }
        // pivot은 그대로 두고 계속 진행함 자연스럽게 왼쪽 분할 정렬 끝
        // pivot이 위치를 변경해도 새로운 피봇으로 high가 start와 같을때까지 반복
        // start는 0 고정임
        quickSort(arr,start,high-1);
        // 여기에서는 pivot 위치 빠꿔서 오른쪽 분할 정렬
        quickSort(arr,high+1,end);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
