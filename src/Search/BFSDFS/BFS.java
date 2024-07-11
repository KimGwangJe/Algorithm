package Search.BFSDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static int GRAPH_LIST_SIZE = 9;
    public static boolean[] visited = new boolean[GRAPH_LIST_SIZE];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args){
        for(int i = 0; i < GRAPH_LIST_SIZE; i++){
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);
        graph.get(2).add(8);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);

        bfs(1);
    }

    public static void bfs(int point){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(point);
        visited[point] = true;

        while(!queue.isEmpty()){
            int target = queue.poll();
            System.out.println(target);

            for(int node: graph.get(target)){
                if(!visited[node]){
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
    }
}
