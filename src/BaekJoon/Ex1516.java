package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1516 {
    public static void main(String[] args) throws Exception {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }

        int[] degree = new int[N+1];
        int[] time = new int[N+1]; //시간

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while(true){
                int a = Integer.parseInt(st.nextToken());
                if(a == -1) break;
                list.get(a).add(i);
                degree[i]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            if(degree[i] == 0){
                que.add(i);
            }
        }
        int[] result = new int[N+1];
        while(!que.isEmpty()){
            int temp = que.poll();
            for(int next: list.get(temp)){
                degree[next]--;
                result[next] = Math.max(result[next], result[temp]+time[temp]);
                if(degree[next] == 0){
                    que.add(next);
                }
            }
        }

        for(int i = 1; i <= N; i++){
            System.out.println(result[i]+time[i]);
        }
    }
}
