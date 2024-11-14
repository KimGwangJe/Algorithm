package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LongDistanceNode {
    public static void main(String[] args){
        System.out.println(solution(6, new int[][]{{3, 6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}}));
    }

    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;
    public static int solution(int n, int[][] edge) {
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }
        visited = new boolean[n+1];

        for(int i = 0; i < edge.length; i++){
            list.get(edge[i][0]).add(edge[i][1]);
            list.get(edge[i][1]).add(edge[i][0]);
        }

        //BFS로 풀어야될듯
        int[] answer = new int[n+1];
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        int length = 1;
        visited[1] = true;

        while(!que.isEmpty()) {
            int currentSize = que.size();
            for(int j = 0; j < currentSize; j++){
                int temp = que.poll();
                for(int i : list.get(temp)){
                    if(!visited[i]){
                        que.add(i);
                        answer[i] = length;
                        visited[i] = true;
                    }
                }
            }
            length++;
        }

        int result = 0;
        Arrays.sort(answer);
        int max = answer[answer.length-1];
        for(int i = answer.length-1; i >= 0; i--){
            if(answer[i] == max) result++;
        }
        return result;
    }
}
