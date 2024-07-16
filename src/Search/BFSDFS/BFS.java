package Search.BFSDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {
    public static int GRAPH_LIST_SIZE = 7;
    public static boolean[] visited = new boolean[GRAPH_LIST_SIZE];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args){
        for(int i = 0; i < GRAPH_LIST_SIZE; i++){
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(5);
        graph.get(2).add(6);

        graph.get(3).add(4);

        graph.get(4).add(6);
        bfs(1);
    }

    public static void bfs(int point){
        Stack<Integer> stack = new Stack<>();
        stack.add(point);
        while(!stack.isEmpty()){
            int V = stack.pop();
            System.out.println(V);
            for(int i = 0; i < graph.get(V).size(); i++){
                if(!visited[graph.get(V).get(i)]){
                    stack.add(graph.get(V).get(i));
                    visited[graph.get(V).get(i)] = true;
                }
            }
        }
    }
}
