package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex13023 {
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean arrive = false;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            list.add(new ArrayList<>());
        }

        visited = new boolean[N];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for(int i = 0; i < N; i++){
            DFS(i,1);
            if(arrive) break;
        }
        System.out.println(arrive ? "1" : "0");
    }

    public static void DFS(int a, int depth){
        if(depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[a] = true;
        for(int i : list.get(a)){
            if(!visited[i]) DFS(i,depth+1);
        }
        visited[a] = false;
    }
}
