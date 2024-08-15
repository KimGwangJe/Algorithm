package BaekJoon;

import java.util.Scanner;

public class Ex10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[20+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i < N+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[N]);
    }
}
