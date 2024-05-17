package Search;

import java.util.LinkedList;
import java.util.Queue;

public class Ex027DFS {
    static int N = 4;
    static int M = 6;
    static boolean[][] visited = new boolean[N+1][M+1];
    static int[][] arr = {{1,0,1,1,1,1},{1,0,1,0,1,0},{1,0,1,0,1,1},{1,1,1,0,1,1}};
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args){
        DFS(0,0);
        System.out.println(arr[N-1][M-1]);
    }

    public static void DFS(int startX, int startY){
        Queue<int[]> queue = new LinkedList<>();
        visited[startX][startY] = true;
        queue.offer(new int[]{startX, startY});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int i = 0; i < 4; i++){
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                if(x >= 0 && y >= 0 && x < N && y < M){
                    if(arr[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }
    }
}
