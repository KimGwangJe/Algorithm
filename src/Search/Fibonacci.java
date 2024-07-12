package Search;

import java.util.Arrays;

public class Fibonacci {
    public static int[] arr = new int[8];
    public static void main(String[] args){
        fibonacci(7);
        System.out.println(Arrays.toString(arr));
    }

    public static int fibonacci(int n){
        if(arr[n] > 0){
            return arr[n];
        }
        if(n == 0 || n == 1){
            return arr[n] = 1;
        } else {
            return arr[n] = fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
