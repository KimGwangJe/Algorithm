package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1068 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;
    public static int num = 0;
    public static int end = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(new ArrayList<>());
        }
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Top = 0;
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a != -1){
                list.get(a).add(i);
                list.get(i).add(a);
            } else {
                Top = i;
            }
        }
        end = Integer.parseInt(br.readLine());
        if(end == Top){
            System.out.println(0);
        } else {
            DFS(Top);
            System.out.println(num);
        }
    }

    public static void DFS(int n){
        visited[n] = true;
        int cNode = 0;
        for(int i = 0; i < list.get(n).size(); i++){
            if(!visited[list.get(n).get(i)] && list.get(n).get(i) != end){
                cNode++;
                DFS(list.get(n).get(i));
            }
        }
        if(cNode == 0) num++;
    }
}
