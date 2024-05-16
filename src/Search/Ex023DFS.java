package Search;

import java.util.ArrayList;

public class Ex023DFS {
    static int N = 6;
    static boolean[] visited = new boolean[N+1];
    static ArrayList<Integer>[] list = new ArrayList[N+1];

    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,5},{5,1},{3,4},{4,6}};
        for(int i = 1; i < N + 1; i++) {
            list[i] =  new ArrayList<Integer>();
        }
        for(int i = 0; i < arr.length; i++){
            list[arr[i][0]].add(arr[i][1]);
            list[arr[i][1]].add(arr[i][0]);
        }

        int count = 0;
        for(int i = 1; i < N + 1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    public static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i: list[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
