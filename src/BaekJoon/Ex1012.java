package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1012 {
    public static int[][] arr;
    public static int count = 0;
    public static boolean[][] visited;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int a;
    public static int b;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr = new int[a][b];
            visited = new boolean[a][b];

            for(int j = 0; j < c; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            for(int j = 0; j < a; j++){
                for(int k = 0; k < b; k++){
                    if(arr[j][k] == 1 && !visited[j][k]){
                        DFS(j, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

    public static void DFS(int i, int j){
        visited[i][j] = true;
        for(int k = 0; k < 4; k++){
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(nx >= 0 && nx < a && ny >= 0 && ny < b && !visited[nx][ny] && arr[nx][ny] == 1){
                DFS(nx, ny);
            }
        }
    }
}
