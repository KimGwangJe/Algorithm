package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex18352 {
    public static int[] distance;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 도시 개수
        int M = Integer.parseInt(st.nextToken()); // 도로 개수
        int K = Integer.parseInt(st.nextToken()); // 거리 정보
        int X = Integer.parseInt(st.nextToken()); // 출발 도시

        distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        visited = new boolean[N+1];

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            list.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        BFS(X);

        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= N; i++){
            if(distance[i] == K) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.length() == 0 ? "-1" : sb);
    }

    public static void BFS(int x){
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        visited[x] = true;
        distance[x] = 0;

        while(!que.isEmpty()){
            int Q = que.poll();
            for(int next : list.get(Q)){
                if(!visited[next]){
                    que.add(next);
                    distance[next] = distance[Q] + 1;
                    visited[next] = true;
                }
            }
        }
    }
}
