package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex2178 {
    public static String[][] miro;
    public static boolean[][] visited;
    public static int length = Integer.MAX_VALUE;
    public static int[] dx = {1, 0, 0, -1};
    public static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        miro = new String[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            for(int j = 0; j < str.length; j++){
                miro[i][j] = str[j];
            }
        }

//        DFS(0,0,1);
//        System.out.println(length);

        BFS(0,0);
        System.out.println(miro[N-1][M-1]);
    }

    public static void DFS(int i, int j, int sum){
        if(i == miro.length-1 && j == miro[0].length - 1){
            length = Math.min(length, sum);
            return;
        }
        visited[i][j] = true;
        for(int k = 0; k < 4; k++){
            if(i+dx[k] >= 0 && j+dy[k] >= 0 && i+dx[k] < miro.length && j+dy[k] < miro[0].length && !visited[i+dx[k]][j+dy[k]] && miro[i+dx[k]][j+dy[k]].equals("1")){
                DFS(i+dx[k], j + dy[k] , sum + 1);
            }
        }

        visited[i][j] = false;
    }

    public static void BFS(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j] = true;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            for(int k = 0; k < 4; k++){
                int x = arr[0] + dx[k];
                int y = arr[1] + dy[k];
                if(x >= 0 && y >= 0 && x < miro.length && y < miro[0].length && !visited[x][y] && !miro[x][y].equals("0")){
                    visited[x][y] = true;
                    miro[x][y] = Integer.toString(Integer.parseInt(miro[arr[0]][arr[1]]) + 1);
                    q.add(new int[]{x,y});
                }
            }
        }
    }
}
