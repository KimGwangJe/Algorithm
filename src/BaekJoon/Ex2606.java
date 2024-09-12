package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex2606 {
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();;
    public static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++){
            arr.add(new ArrayList<>());
        }

        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        visited[1] = true;
        DFS(1);

        int count = 0;
        for(int i = 2; i < visited.length; i++){
            if(visited[i]){
               count++;
            }
        }
        System.out.println(count);
    }

    public static void DFS(int n){
        for(int i = 0; i < arr.get(n).size(); i++){
            if(!visited[arr.get(n).get(i)]){
                visited[arr.get(n).get(i)] = true;
                DFS(arr.get(n).get(i));
            }
        }
    }
}
