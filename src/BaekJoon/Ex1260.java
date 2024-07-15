package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1260 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;
    public static String dfs = "";
    public static String bfs = "";

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        visited[0] = true;

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a <= N && b <= N) {
                list.get(a).add(b);
                list.get(b).add(a);
            }
        }
        for(int i = 0; i <= N; i++){
            Collections.sort(list.get(i));
        }

        DFS(V);
        Arrays.fill(visited, false);
        BFS(V);

        System.out.println(dfs.trim());
        System.out.println(bfs.trim());
    }

    public static void DFS(int V){
        visited[V] = true;
        dfs += Integer.toString(V) + " ";
        for(int i : list.get(V)){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    public static void BFS(int V){
        Queue<Integer> que = new LinkedList<>();
        que.add(V);
        visited[V] = true;
        while(!que.isEmpty()){
            int a = que.poll();
            bfs += Integer.toString(a) + " ";
            for(int i : list.get(a)){
                if(!visited[i]){
                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
