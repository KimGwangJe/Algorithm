package Sort;

public class MergeSort {
    static int[] arr = {42,32,24,60,15,5,90,45};
    static int[] temp = new int[arr.length];
    public static void main(String[] args) {
        mergeSort(0, arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void mergeSort(int left, int right){
        if(left == right) return;
        int mid = (left + right)/2;

        mergeSort(left, mid);
        mergeSort(mid + 1, right);

        for(int i = left; i <= right; i++){
            temp[i] = arr[i];
        }

        int l = left;
        int r = mid + 1;
        int idx = left;

        while(l <= mid && r <= right){
            if(temp[l] <= temp[r]){
                arr[idx++] = temp[l++];
            } else{
                arr[idx++] = temp[r++];
            }
        }

        while (l <= mid) { // 왼쪽 남은 부분 복사
            arr[idx++] = temp[l++];
        }
        while (r <= right) { // 오른쪽 남은 부분 복사
            arr[idx++] = temp[r++];
        }
    }
}
