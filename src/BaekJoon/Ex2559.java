package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2559 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] temp = new int[N+1];
        st = new StringTokenizer(br.readLine());
        temp[0] = 0;

        for(int i = 1; i <= N; i++){
            temp[i] = Integer.parseInt(st.nextToken()) +temp[i-1];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= N-M; i++){
            int a = temp[i+M] - temp[i];
            if(a > max){
                max = a;
            }
        }
        System.out.println(max);
    }
}
