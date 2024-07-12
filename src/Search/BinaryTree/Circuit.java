package Search.BinaryTree;

import java.util.ArrayList;

public class Circuit {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args){
        for(int i = 0; i < 8; i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        list.get(1).add(2);
        list.get(1).add(3);

        list.get(2).add(4);
        list.get(2).add(5);

        list.get(3).add(6);
        list.get(3).add(7);

        dfs(0);
    }

    static void dfs(int node){
        if(list.get(node).isEmpty()){
            return;
        }
        for(int i = 0; i < list.get(node).size(); i++){
            System.out.print(list.get(node).get(i) + " "); //전위순회
            dfs(list.get(node).get(i));
            // System.out.print(list.get(node).get(i) + " "); //후위순회
        }
    }
}
