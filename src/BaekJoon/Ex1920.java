package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1920 {
    public static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            search(0,arr.length - 1, Integer.parseInt(st.nextToken()));
        }
    }

    public static void search(int left, int right, int target){
        if(left > right){
            System.out.println("0");
            return;
        }
        int pivot = (left + right) / 2;
        if(target == arr[pivot]){
            System.out.println("1");
            return;
        }
        if(target < arr[pivot]){
            search(left, pivot - 1, target);
        } else {
            search(pivot + 1, right, target);
        }
    }
}
