package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//시간 초과

public class Ex2293 {
    public static int M;
    public static int N;
    public static int[] arr;
    public static int count = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        DFS(0 , 0);
        System.out.println(count);
    }

    public static void DFS(int sum, int index){
        if(sum == M) {
            count++;
            return;
        }
        if(sum > M) return;
        for(int j = index; j < N; j++){
            DFS(sum + arr[j], j);
        }
    }
}