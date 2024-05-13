package Sort;

public class MergeSort {
    static int[] arr = {42,32,24,60,15,5,90,45};
    static int[] temp = new int[arr.length];
    public static void main(String[] args){
        mergeSort(0,arr.length-1);
        for(int i: arr){
            System.out.println(i);
        }
    }

    public static void mergeSort(int left, int right){
        if(right - left < 1) return;
        int mid = (left + right)/2;
        mergeSort(left,mid);
        mergeSort(mid+1,right);

        for(int i = left; i <= right; i++){
            temp[i] = arr[i];
        }

        int k = left;
        int index1 = left;
        int index2 = mid+1;
        while(index1 <= mid && index2 <= right){
            if(temp[index1] < temp[index2]){
                arr[k] = temp[index1];
                index1++;
                k++;
            } else{
                arr[k] = temp[index2];
                index2++;
                k++;
            }
        }
        //남은거 추가
        while(index1 <= mid){
            arr[k] = temp[index1];
            k++;
            index1++;
        }
        while(index2 <= right){
            arr[k] = temp[index2];
            k++;
            index2++;
        }
    }
}
