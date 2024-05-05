package PrefixSum;

import java.util.Arrays;

public class ex007 {
    public static int P007(){
        int[] arr = {2,7,4,1,5,3};
        int N = 9;
        int count = 0;
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            if(arr[l] + arr[r] == N){
                count++;
                l++;
                r--;
            } else if(arr[l] + arr[r] < N) l++;
            else r--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,5,3};
        int N = 9;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) continue;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j]==N){
                    count++;
                    arr[i] = arr[j] = 0;
                }
            }
        }
        System.out.println(count);
        System.out.println(P007());
    }
}
