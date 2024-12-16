package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex15649 {
    public static boolean[] visited;
    public static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++){
            visited = new boolean[n+1];
            int[] sequence = new int[n+1];
            sequence[1] = i;
            visited[i] = true;
            DFS( 1, sequence);
        }
    }

    public static void DFS(int depth, int[] sequence){
        if(depth == M){
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < sequence.length; i++){
                sb.append(sequence[i]).append(" ");
            }
            System.out.println(sb);
        }
        for(int i = 1; i < visited.length; i++){
            if(!visited[i]){
                visited[i] = true;
                sequence[depth+1] = i;
                DFS(depth+1, sequence);
                visited[i] = false;
            }
        }
    }
}
