package Search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IceDrink {
    public static int num = 0;
    public static int[][] arr;
    public static boolean[][] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String[] a = br.readLine().split("");
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(a[j]);
            }
        }

        for(int x = 0; x < N; x++){
            for(int y = 0; y < M; y++){
                if(dfs(x,y)){
                    num++;
                }
            }
        }
        System.out.println(num);
    }

    public static boolean dfs(int x, int y){
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        if(x >= arr.length || y >= arr[0].length || x < 0 || y < 0 || visited[x][y] || arr[x][y] == 1){
            return false;
        }

        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            dfs(x + dx[i], y + dy[i]);
        }
        return true;
    }
}
