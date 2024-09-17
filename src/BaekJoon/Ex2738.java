package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex2738 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<M;j++){
                arr[i][j] += Integer.parseInt(st.nextToken());
                bw.write(arr[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();

    }
}
