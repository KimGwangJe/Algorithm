package Search.BFSDFS;

import java.util.ArrayList;

public class DFS {
    public static int GRAPH_LIST_SIZE = 9;
    public static boolean[] visited = new boolean[GRAPH_LIST_SIZE];
    //길이가 정해져있지 않은 코딩테스트에서는 ArrayList안에 ArrayList를 추가하는 것이 더 좋을듯
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

        dfs(1);
    }

    public static void dfs(int point){
        visited[point] = true;
        System.out.println(point + " ");

        for(int i : graph.get(point)){
            if(!visited[i]){
                dfs(i);
            }
        }
    }

}
