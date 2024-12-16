package Sort;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class QuickSort {
    public static int[] arr = {6,8,1,7,4,3,5,2};
    public static void main(String[] args){
        quickSort(0, arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int left, int right){
        if(left >= right) return;

        int pivot = partition(left, right);
        quickSort(left, pivot-1);
        quickSort(pivot+1, right);
    }

    public static int partition(int left, int right){
        int pivot = left;
        int l = left+1;
        int r = right;

        while(l <= r){
            while(l <= right && arr[l] <= arr[pivot]) l++;
            while(r > left && arr[r] >= arr[pivot]) r--;

            if(l < r){
                swap(l, r);
            }
        }
        swap(pivot, r);
        return r;
    }

    public static void swap(int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
