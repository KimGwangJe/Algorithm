package Search;

import java.util.ArrayList;

public class Ex025DFS {
    static int N = 8;
    static boolean[] visited = new boolean[N];
    static boolean arrive;
    static ArrayList<Integer>[] list = new ArrayList[N];
    public static void main(String[] args){
        for(int i = 0; i < N; i++){
            list[i] = new ArrayList<Integer>();
        }
        int[][] a = {{1,7},{3,7},{4,7},{3,4},{4,6},{3,5},{0,4},{2,7}};
        for(int i = 0; i < N; i++){
            list[a[i][0]].add(a[i][1]);
            list[a[i][1]].add(a[i][0]);
        }

        for(int i = 0; i < N; i++){
            DFS(i,1);
        }
        if(arrive) System.out.println(1);
        else System.out.println(0);
    }

    public static void DFS(int i,int depth){
        if(depth == 5 || arrive){
            arrive = true;
            return;
        }
        visited[i] = true;
        for(int j = 0; j < list[i].size(); j++){
            if(!visited[list[i].get(j)]){
                DFS(list[i].get(j),depth+1);
            }
        }
    }
}
