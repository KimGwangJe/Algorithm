package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> que = new LinkedList<>();
        for(int i = 0; i < N; i++){
            que.addLast(i+1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int idx = 1;
        while (!que.isEmpty()) {
            if(idx == M){
                if(que.size() != 1){
                    int a = que.removeFirst();
                    sb.append(a).append(", ");
                    idx = 1;
                } else {
                    sb.append(que.removeFirst()).append(">");
                }
            } else {
                que.addLast(que.removeFirst());
                idx++;
            }
        }
        System.out.println(sb);
    }
}
