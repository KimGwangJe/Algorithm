package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2,2 4,4 면
// 4,4 - 2,1 - 1,2, + 1,1
public class Ex11660 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < M; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for (int j = a; j <= c; j++) {
                sum = sum + (arr[j][d] - arr[j][b-1]);
            }
            System.out.println(sum);
        }
    }
}
