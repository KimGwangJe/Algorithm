package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ex1715 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int i = 0; i < N; i++){
            que.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;
        int a = 0;
        int b = 0;
        while(que.size() != 1){
            a = que.remove();
            b = que.remove();
            answer += a+b;
            que.add(a+b);
        }
        System.out.println(answer);
    }
}
