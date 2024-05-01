package Algorithm.Sort;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right){
        int pl = left;
        int pr = right;
        int x = arr[(pl+pr) / 2];

        do{
            while(arr[pl] < x) pl++;
            while(arr[pr] > x) pr--;
            if(pl <= pr){
                int temp = arr[pl];
                arr[pl] = arr[pr];
                arr[pr] = temp;
                pl++;
                pr--;
            }
        } while(pl<=pr);

        if(left < pr) quickSort(arr,left, pr);
        if(pl < right) quickSort(arr,pl, right);
    }
    public static void main(String[] args){
        int[] arr = {5,8,4,2,6,1,3,9,7};
        quickSort(arr,0,arr.length-1);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
