package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1806 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(left <= right && right <= N){
            if(sum < M) sum += arr[right++];
            else if(sum >= M){
                min = Math.min(min, right - left);
                sum-=arr[left++];
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}
