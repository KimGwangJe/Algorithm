package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex15650 {
    public static boolean[] visited;
    public static int N;
    public static int M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        N = Integer.parseInt(str.split(" ")[0]);
        M = Integer.parseInt(str.split(" ")[1]);

        visited = new boolean[N + 1];

        ArrayList<Integer> list = new ArrayList<>();
        DFS(1, 0, list);
    }

    public static void DFS(int i, int depth, ArrayList<Integer> list){
        if(depth == M){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < list.size(); j++){
                sb.append(list.get(j)).append(" ");
            }
            System.out.println(sb.toString().trim());
            return;
        }
        for(int j = i; j < N+1; j++){
            if(!visited[j]){
                visited[j] = true;
                list.add(j);
                DFS(j, depth + 1, list);
                list.remove(list.size()-1);
                visited[j] = false;
            }
        }
    }
}
