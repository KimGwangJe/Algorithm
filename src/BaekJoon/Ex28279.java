package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex28279 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> que = new LinkedList<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a == 1){
                que.addFirst(Integer.parseInt(st.nextToken()));
            } else if(a == 2){
                que.addLast(Integer.parseInt(st.nextToken()));
            } else if(a == 3){
                if(que.isEmpty()){
                    bw.write(-1 + "\n");
                } else{
                    bw.write(que.removeFirst() + "\n");
                }
            } else if(a == 4){
                if(que.isEmpty()){
                    bw.write(-1  + "\n");
                } else {
                    bw.write(que.removeLast()  + "\n");
                }
            } else if(a == 5){
                bw.write(que.size()  + "\n");
            } else if(a == 6){
                bw.write(que.isEmpty() ? 1  + "\n" : 0  + "\n");
            } else if(a == 7){
                bw.write(que.isEmpty() ? -1  + "\n" : que.getFirst()  + "\n");
            } else{
                bw.write(que.isEmpty() ? -1  + "\n" : que.getLast()  + "\n");
            }
        }
        bw.flush();
    }
}
