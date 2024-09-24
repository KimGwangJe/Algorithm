package BaekJoon;

import Search.BFSDFS.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex24444 {
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
        BFS(start);
        for(int i = 1; i <=N; i++){
            System.out.println(result[i]);
        }
    }

    public static void BFS(int start){
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        visited[start] = true;
        result[start] = count++;
        while (!que.isEmpty()) {
            int now = que.poll();
            Collections.sort(list.get(now));
            for(int i = 0; i < list.get(now).size(); i++){
                if(!visited[list.get(now).get(i)]){
                    que.add(list.get(now).get(i));
                    visited[list.get(now).get(i)] = true;
                    result[list.get(now).get(i)] = count++;
                }
            }
        }
    }
}
