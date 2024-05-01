package Algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static int bs(int[] nums, int n, int target) {

        int pl = 0 ;
        int pr = n - 1;
        while(pl <= pr) {
            int pc = (pl + pr) / 2;
            if(nums[pc] == target) {
                return pc;
            } else if(nums[pc] > target){
                pr = pc - 1;
            } else {
                pl = pc + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        return Arrays.binarySearch(nums,target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int target = 7;
        System.out.println(bs(arr, n, target));
        System.out.println(binarySearch(arr,target));
    }
}
