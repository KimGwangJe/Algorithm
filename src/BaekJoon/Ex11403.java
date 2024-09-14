package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex11403 {
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        for(int i = 0; i <= N; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 1; i <= N; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 1; j <= str.length; j++){
                if(str[j - 1].equals("1")){
                    arr.get(i).add(j);
                }
            }
        }

        for(int i = 1; i <= N; i++){
            boolean[] visited = new boolean[N+1];
            DFS(i, visited);
            for(int j = 1; j <= N; j++){
                bw.write(visited[j] ? "1 " : "0 ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void DFS(int i, boolean[] visited){
        for(int j = 0; j < arr.get(i).size(); j++){
            if(!visited[arr.get(i).get(j)]){
                visited[arr.get(i).get(j)] = true;
                DFS(arr.get(i).get(j), visited);
            }
        }
    }
}
