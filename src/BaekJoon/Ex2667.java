package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2667 {
    public static int[][] arr;
    public static boolean[][] visited;
    public static int Num = 1;
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split("");
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j] && arr[i][j] == 1){
                    int count = DFS(i, j);
                    list.add(count);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for(int i : list){
            System.out.println(i);
        }
    }

    public static int DFS(int i, int j){
        int count = 1;
        arr[i][j] = Num;
        visited[i][j] = true;
        for(int idx = 0; idx < 4; idx++){
            int ni = i + dx[idx];
            int nj = j + dy[idx];
            if (ni >= 0 && ni < arr.length && nj >= 0 && nj < arr[0].length && arr[ni][nj] == 1 && !visited[ni][nj]) {
                count += DFS(ni, nj);
            }
        }
        return count;
    }
}
