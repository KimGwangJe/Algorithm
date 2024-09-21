package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;

        int[] tree = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }

        int left = 0;
        int right = max;
        int answer = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            long sum = 0;

            for(int i: tree){
                if(i - mid > 0){
                    sum += (i - mid);
                }
            }

            if(sum >= M){
                left = mid + 1;
                answer = mid;
            } else{
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
