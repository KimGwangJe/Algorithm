package BaekJoon;

import java.util.*;

public class Ex2252 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < N+1; i++){
            list.add(new ArrayList<>());
        }
        int[] degree = new int[N+1];
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            degree[b]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < N+1; i++){
            if(degree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            for(int next: list.get(now)){
                degree[next]--;
                if(degree[next] == 0){
                    q.offer(next);
                }
            }
        }
    }
}
