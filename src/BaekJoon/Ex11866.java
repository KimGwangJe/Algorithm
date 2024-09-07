package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex11866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> que = new LinkedList<>();
        for(int i = 1;i <= N; i++){
            que.add(i);
        }

        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(!que.isEmpty()){
            if(i == M){
                list.add(que.removeFirst());
                i=1;
            } else {
                que.addLast(que.removeFirst());
                i++;
            }
        }
        sb.append("<");
        for(int j = 0; j < list.size(); j++){
            if(j == list.size()-1){
                sb.append(list.get(j)).append(">");
            }else {
                sb.append((list.get(j))).append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
