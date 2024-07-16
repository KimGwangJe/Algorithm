package Search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex023DFS {
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static int a = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                DFS(i);
                a++;
            }
        }
        System.out.println(a);
    }

    public static void DFS(int v){
        visited[v] = true;
        for(int i =0; i < list.get(v).size(); i++){
            if(!visited[list.get(v).get(i)]){
                DFS(list.get(v).get(i));
            }
        }
    }
}
