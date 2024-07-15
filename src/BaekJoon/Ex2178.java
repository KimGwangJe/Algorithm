package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex2178 {
    public static String[][] miro;
    public static boolean[][] visited;
    public static int N, M;
    public static int minSteps = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new String[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String[] a = br.readLine().split("");
            for(int j = 0; j < M; j++){
                miro[i][j] = a[j];
            }
        }
        DFS(0,0, 1);
        System.out.println(minSteps);
    }

    public static void DFS(int i, int j, int sum){
        if(i == N - 1 && j == M - 1) {
            minSteps = Math.min(minSteps, sum);
            return;
        }
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        visited[i][j] = true;
        for(int k = 0; k < 4; k++){
            int x = i + dx[k];
            int y = j + dy[k];

            //이동 조건
            if (x >= 0 && y >= 0 && x < N && y < M &&
                    miro[x][y].equals("1") && !visited[x][y]) {
                DFS(x, y, sum + 1);
            }
        }
    }
}
