package Sort;

public class MergeSort {
    static int[] arr = {42,32,24,60,15,5,90,45};
    static int[] temp = new int[arr.length];
    public static void main(String[] args) {
        mergeSort(0, arr.length - 1);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void mergeSort(int left, int right){
        if(left == right) return;

        int mid = (left + right)/2;
        mergeSort(left, mid);
        mergeSort(mid+1, right);

        int l = left;
        int r = mid + 1;
        int idx = left;

        while(l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                temp[idx++] = arr[l++];
            } else {
                temp[idx++] = arr[r++];
            }
        }
        while(l <= mid){
            temp[idx++] = arr[l++];
        }
        while(r <= right){
            temp[idx++] = arr[r++];
        }
        for(int i = left; i <= right; i++){
            arr[i] = temp[i];
        }
    }
}
