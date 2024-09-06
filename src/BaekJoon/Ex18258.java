package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex18258 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            } else if(str.equals("pop")){
                if(queue.isEmpty()){
                    bw.write("-1" + "\n");
                } else {
                    bw.write(queue.removeFirst() + "\n");
                }
            } else if(str.equals("size")){
                bw.write(queue.size() + "\n");
            } else if(str.equals("empty")){
                if(queue.isEmpty()){
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if(str.equals("front")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.getFirst() + "\n");
                }
            } else if(str.equals("back")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                } else {
                    bw.write(queue.getLast() + "\n");
                }
            }
        }
        bw.flush();
    }
}
