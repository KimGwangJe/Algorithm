package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex24480 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static int[] result;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int count = 1;
    public static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Start  = Integer.parseInt(st.nextToken());

        result = new int[N+1];
        visited = new boolean[N+1];
        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        DFS(Start);
        for(int i = 1; i < result.length; i++){
            bw.write(result[i] + "\n");
        }
        bw.flush();
    }

    public static void DFS(int start) throws Exception {
        result[start] = count++;
        visited[start] = true;
        Collections.sort(list.get(start), Collections.reverseOrder());
        for(int i = 0; i < list.get(start).size(); i++){
            if(!visited[list.get(start).get(i)]){
                DFS(list.get(start).get(i));
            }
        }
        return;
    }
}
