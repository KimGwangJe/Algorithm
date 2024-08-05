package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex11725 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i <=N; i++){
            list.add(new ArrayList<>());
        }

        StringTokenizer st;
        for(int i = 0; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        int[] parent = new int[N+1];
        boolean[] visited = new boolean[N+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()){
            int now = queue.poll();
            visited[now] = true;
            for(int i = 0; i < list.get(now).size(); i++){
                if(!visited[list.get(now).get(i)]){
                    visited[list.get(now).get(i)] = true;
                    parent[list.get(now).get(i)] = now;
                    queue.add(list.get(now).get(i));
                }
            }
        }
        for(int i = 2; i <= N; i++){
            System.out.println(parent[i]);
        }
    }
}
