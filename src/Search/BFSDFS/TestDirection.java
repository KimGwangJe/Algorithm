package Search.BFSDFS;

import java.util.ArrayList;

public class TestDirection {

    public static boolean[] visited = new boolean[7];
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args){
        for(int i = 0; i < 7; i++){
            list.add(new ArrayList<>());
        }

        list.get(1).add(2);
        list.get(1).add(3);

        list.get(2).add(5);
        list.get(2).add(6);

        list.get(3).add(4);

        list.get(4).add(6);

        DFS(1);
    }

    public static void DFS(int v) {
        visited[v] = true;
        System.out.println(v);
        for(int i = 0; i < list.get(v).size(); i++){
            if(!visited[list.get(v).get(i)]){
                DFS(list.get(v).get(i));
            }
        }
    }
}
