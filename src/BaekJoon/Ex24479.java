package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex24479 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;
    public static int[] result;
    public static int count = 1;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        result = new int[N+1];
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

        DFS(start);
        for(int i = 1; i <=N; i++){
            System.out.println(result[i]);
        }
    }

    public static void DFS(int start){
        visited[start] = true;
        result[start] = count++;
        Collections.sort(list.get(start));
        for(int i = 0; i < list.get(start).size(); i++){
            if(!visited[list.get(start).get(i)]){
                DFS(list.get(start).get(i));
            }
        }
    }
}