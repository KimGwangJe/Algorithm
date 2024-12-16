package Search;

import java.util.Arrays;

public class BinarySearch {
    public static int[] arr = {4,5,1,3,2,7,6};
    public static void main(String[] args){
        Arrays.sort(arr);
        int target = 2;
        int idx;
        idx = binarySearch1(0, arr.length - 1, target);
        System.out.println("Target Num idx = " + idx);
        idx = binarySearch2(0, arr.length - 1, target);
        System.out.println("Target Num idx = " + idx);
    }

    //반복
    public static int binarySearch1(int left, int right, int target){
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }

    //재귀
    public static int binarySearch2(int left, int right, int target){
        if(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                return binarySearch2(mid + 1, right, target);
            } else {
                return binarySearch2(left, mid - 1, target);
            }
        }
        return -1;
    }
}
