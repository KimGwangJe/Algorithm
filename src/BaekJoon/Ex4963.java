package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4963 {
    public static int[][] arr;
    public static boolean[][] visited;
    public static int n;
    public static int m;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] str = br.readLine().split(" ");
            if(str.length == 2 && str[0].equals("0") && str[1].equals("0")) break;

            n = Integer.parseInt(str[0]);
            m = Integer.parseInt(str[1]);
            arr = new int[m+2][n+2];
            visited = new boolean[m+2][n+2];
            for(int i = 1; i <= m; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n; j++){
                    if(arr[i][j] == 1 && !visited[i][j]){
                        visited[i][j] = true;
                        DFS(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    // 1인거 계속 찾아다녀야됨
    public static void DFS(int i, int j){
        for(int k = i-1; k <= i+1; k++){
            for(int q = j-1; q <= j+1; q++){
                if(k == i && q == j) continue;
                if(!visited[k][q] && arr[k][q] == 1){
                    visited[k][q] = true;
                    DFS(k, q);
                }
            }
        }
    }
}
