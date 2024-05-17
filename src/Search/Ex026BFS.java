package Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ex026BFS {
    static int N = 4;
    static int Start = 1;
    static boolean[] visited = new boolean[N + 1];
    static ArrayList<Integer>[] list = new ArrayList[N + 1];

    public static void main(String[] args){
        int[][] arr = {{1,2},{1,3},{1,4},{2,4},{3,4}};
        for(int i = 1; i < N + 1; i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < arr.length; i++){
            list[arr[i][0]].add(arr[i][1]);
            list[arr[i][1]].add(arr[i][0]);
        }
        BFS(Start);
    }

    public static void BFS(int Node){
        Queue<Integer> queue = new LinkedList<>();
        visited[Node] = true;
        queue.add(Start);

        while(!queue.isEmpty()){
            int new_Node = queue.poll();
            System.out.println(new_Node);
            for(int i: list[new_Node]){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
