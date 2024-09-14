package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex2644 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static int a = 0;
    public static int b = 0;
    public static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N+1; i++){
            list.add(new ArrayList<>());
        }
        visited = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            list.get(child).add(parent);
            list.get(parent).add(child);
        }

        int count = DFS(a, 0);
        System.out.println(count);
    }

    public static int DFS(int a, int count){
        visited[a] = true;
        if(a == b) return count;
        for(int i = 0; i < list.get(a).size(); i++){
            if(!visited[list.get(a).get(i)]){
                int result = DFS(list.get(a).get(i), count + 1);
                if(result != -1) return result;
            }
        }
        return -1;
    }
}
